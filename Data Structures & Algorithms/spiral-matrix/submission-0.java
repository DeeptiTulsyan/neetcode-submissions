class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int row=0;
        int col=matrix[0].length-1;
        int bottom=matrix.length-1;
        int left=0;
        while(row<=bottom && left<=col)
        {
        for(int i=left;i<=col;i++)
        {
            list.add(matrix[row][i]);
        }
        row++;
        for(int i=row;i<=bottom;i++)
        {
            list.add(matrix[i][col]);
        }
        col--;
        if(bottom>=row)
        {
        for(int i=col;i>=left;i--)
        {
            list.add(matrix[bottom][i]);
        }
        
        bottom--;
        }
        if(left<=col)
        {
        for(int i=bottom;i>=row;i--)
        {
            list.add(matrix[i][left]);
        }
        left++;
        }
    }
    return list;
    }
}
