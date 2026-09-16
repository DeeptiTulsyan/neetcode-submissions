class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
            return false;
        }
        return true;
    }
}
