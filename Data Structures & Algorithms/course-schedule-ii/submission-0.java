class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> ans=new ArrayList<>();
        int[] indegree=new int[numCourses];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] course:prerequisites)
        {
            int a=course[0];
            int b=course[1];
            indegree[a]+=1;
            adj.get(b).add(a);
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            queue.add(i);
        }
        while(!queue.isEmpty())
        {
            int src=queue.poll();
            ans.add(src);
            for(int neigh:adj.get(src))
            {
                indegree[neigh]-=1;
                if(indegree[neigh]==0)
                queue.add(neigh);
            }
        }
        for(int i:indegree)
        {
            if(i!=0)
            return new int[]{};
        }
        int[] answer=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            answer[i]=ans.get(i);
        }
        return answer;
    }
}
