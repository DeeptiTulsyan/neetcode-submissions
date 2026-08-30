/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)->a.start-b.start);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->a-b);
        for(Interval meetings:intervals)
        {
            if(!pq.isEmpty()&&meetings.start>=pq.peek())
            {
                pq.poll();
            }
            pq.add(meetings.end);
        }
        return pq.size();
    }
}
