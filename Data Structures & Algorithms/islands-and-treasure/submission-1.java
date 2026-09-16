class Pair{
    int row;
    int col;
    int val;
    public Pair(int row,int col,int val)
    {
        this.row=row;
        this.col=col;
        this.val=val;
    }
}
class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<Pair> queue=new LinkedList<>();
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    queue.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }
        int[] drow={0,-1,0,1};
        int dcol[]={-1,0,1,0};
        while(!queue.isEmpty())
        {
            Pair p=queue.poll();
            int row=p.row;
            int col=p.col;
            int val=p.val;
            for(int k=0;k<4;k++)
            {
                int nrow=row+drow[k];
                int ncol=col+dcol[k];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol]==false && grid[nrow][ncol]==Integer.MAX_VALUE)
                {
                    grid[nrow][ncol]=val+1;
                    queue.add(new Pair(nrow,ncol,grid[nrow][ncol]));
                    vis[nrow][ncol]=true;
                }
            }
        }
    }
}
