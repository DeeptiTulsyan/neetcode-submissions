class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean check[]=new boolean[256];
        int max=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            while(check[s.charAt(right)])
            {
                check[s.charAt(left)]=false;
                left++;
            }
            check[s.charAt(right)]=true;
            int len=right-left+1;
            max=Math.max(max,len);
        }
        return max;

    }
}
