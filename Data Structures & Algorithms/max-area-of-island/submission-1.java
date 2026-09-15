class Solution {
    public static int cover(int row,int col,int[][] grid,boolean[][] vis,int[] drow,int[] dcol)
    {
        int count=0;
        vis[row][col]=true;
        for(int k=0;k<4;k++)
        {
            int nrow=row+drow[k];
            int ncol=col+dcol[k];
            if(nrow>=0&&nrow<grid.length&&ncol>=0&&ncol<grid[0].length&&grid[nrow][ncol]==1&&!vis[nrow][ncol])
            {
                count+=cover(nrow,ncol,grid,vis,drow,dcol);
            }
        }
        return 1+count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        int count=0;
        int[] drow={0,-1,0,1};
        int[] dcol={-1,0,1,0};
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1&&!vis[i][j])
                {
                    
                    max=Math.max(max,cover(i,j,grid,vis,drow,dcol));
                }
            }
        }
        return max;
    }
}
