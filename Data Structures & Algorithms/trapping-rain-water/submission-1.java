class Solution {
    public int trap(int[] height) {
        int total=0;
        int pm=height[0];
        int[] prefix=new int[height.length];
        prefix[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            pm=Math.max(height[i],pm);
            prefix[i]=pm;
        }
        int sm=height[height.length-1];
        int suffix[]=new int[height.length];
        suffix[height.length-1]=sm;
        for(int j=height.length-1;j>=0;j--)
        {
            sm=Math.max(sm,height[j]);
            suffix[j]=sm;
        }
        for(int i=1;i<height.length-1;i++)
        {
            if(height[i]<prefix[i]&&height[i]<suffix[i])
            {
                total+=Math.min(prefix[i],suffix[i])-height[i];
            }
        }
        return total;
    }
}
