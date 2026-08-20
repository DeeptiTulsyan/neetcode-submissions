class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
            while(k!=0)
            {
                int max=0;
                int occurences=0;
                for(Map.Entry<Integer,Integer> entry:map.entrySet())
                {
                if(entry.getValue()>occurences)
                {
                occurences=entry.getValue();
                max=entry.getKey();
                }
                }
                res[k-1]=max;
                k--;
                map.remove(max);
            }
        return res;
    }
}
