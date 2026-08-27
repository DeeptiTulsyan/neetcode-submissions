class Pair
{
    int row;
    int col;
    public Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public static void traverse(int row,int col,int[][] matrix)
    {
        for(int i=0;i<matrix[0].length;i++)
        {
            matrix[row][i]=0;
        }
        for(int j=0;j<matrix.length;j++)
        {
            matrix[j][col]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    q.add(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            traverse(p.row,p.col,matrix);
        }
    }
}
