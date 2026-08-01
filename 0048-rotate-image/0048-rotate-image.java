class Solution {
    public static void  reverse(int[] arr)
    {
        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int row= matrix.length;
        int column= matrix[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=i+1;j<column;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++)
        {
            reverse(matrix[i]);
        }
        
    }
}