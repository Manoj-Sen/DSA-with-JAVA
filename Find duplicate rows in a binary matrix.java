class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < i ; j++){
                if(Arrays.equals(matrix[i], matrix[j])){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
