class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
            continue;
            int key=nums[i];
            int low=i+1;
            int high=nums.length-1;
            while(low<high)
            {
                if(nums[low]+nums[high]>key*-1)
                {
                    high--;
                }
                else if(nums[low]+nums[high]<key*-1)
                {
                    low++;
                }
                else
                {
                    List<Integer> sub=new ArrayList<>();
                    sub.add(key);
                    sub.add(nums[low]);
                    sub.add(nums[high]);
                    list.add(sub);
                    while(low<nums.length-1&&low<high&&nums[low+1]==nums[low])
                    {
                    low++;
                    }
                    while(high>0&&high>low&&nums[high-1]==nums[high])
                    {
                    high--;
                    }
                    low++;
                    high--;
                }
            }
        }
        return list;
    }
}
