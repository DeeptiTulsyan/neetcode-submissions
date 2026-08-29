class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high=heights.length-1;
        int max=Integer.MIN_VALUE;
        while(low<high)
        {
            int capacity=Math.min(heights[low],heights[high])*(high-low);
            max=Math.max(max,capacity);
            if(heights[low]<=heights[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return max;
    }
}
