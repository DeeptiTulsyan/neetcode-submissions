
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
       HashMap<Integer,Integer> map=new HashMap<>();
       PriorityQueue<Integer> pq=new PriorityQueue<>((x,y)->Integer.compare(map.get(x),map.get(y)));
       for(int i=0;i<nums.length;i++)
       {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       for(Map.Entry<Integer,Integer> entry:map.entrySet())
       {
        pq.add(entry.getKey());
        if(pq.size()>k)
        pq.poll();
       }
       for(int i=0;i<k;i++)
       {
        res[i]=pq.poll();
       }
       return res;
    }
}
