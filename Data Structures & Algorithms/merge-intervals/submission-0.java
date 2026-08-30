class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        List<int[]> list=new ArrayList<>();
        for(int i=1;i<intervals.length;i++)
        {
            int st=intervals[i][0];
            int en=intervals[i][1];
            if(st<=end)
            {
                start=Math.min(start,st);
                end=Math.max(end,en);
            }
            else
            {
                list.add(new int[]{start,end});
                start=st;
                end=en;
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}
