class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int[] ans=new int[temperatures.length];
        for(int i=1;i<temperatures.length;i++)
        {
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
            {
                int index=stack.pop();
                ans[index]=i-index;
            }
            stack.push(i);
        }
    return ans;
    }
}
