class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        int n = matrix.length;
        int x = 0, k = 0;
        int arr[] = new int[n*n];
        
        for(int i=0;i<n;i++){
            k=0;
            for(int j=i;j>=0;j--){
                arr[x++] = matrix[k++][j];
            }
        }
        
        for(int i=1;i<n;i++){
            k=i;
            for(int j=n-1;j>=i;j--){
                arr[x++] = matrix[k++][j];
            }
        }
        return arr;
    }
}
