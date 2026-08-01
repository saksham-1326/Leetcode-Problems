class Solution {
    public void setZeroes(int[][] matrix) {
        int row= matrix.length;
        int column= matrix[0].length;
        boolean[] setZeroRow= new boolean[row];
        boolean[] setZeroColumn= new boolean[column];



        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(matrix[i][j]==0)
                {
                    setZeroRow[i]=true;
                    setZeroColumn[j]=true;
                }
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(setZeroRow[i] || setZeroColumn[j])
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}