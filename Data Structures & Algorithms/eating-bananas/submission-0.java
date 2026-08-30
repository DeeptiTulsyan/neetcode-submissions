class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int n:piles)
        {
            if(n>max)
            max=n;
        }
        int min=1;
        while(min<max)
        {
            int mid=(min+(max-min)/2);
            int total=0;
            for(int n:piles)
            {
                total+=(int)Math.ceil((double)n/mid);
            }
            if(total<=h)
            {
                max=mid;
            }
            else
            {
                min=mid+1;
            }
        }
        return min;
    }
}
