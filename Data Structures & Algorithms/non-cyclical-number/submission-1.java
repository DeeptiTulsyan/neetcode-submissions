class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(!set.contains(n))
        {
            set.add(n);
        int number=0;
        while(n>0)
        {
            int d=n%10;
            number=number+d*d;
            n=n/10;
        }
        if(number==1)
        return true;
        n=number;
        }
        return false;
    }
}
