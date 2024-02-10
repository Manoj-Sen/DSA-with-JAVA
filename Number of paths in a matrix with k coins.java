class Solution {
public long fun(int N, int K, int [][] arr, int i, int j, long [][][] dp){
        if(i >= N || j >= N) return 0;
        if(K < 0) return 0;
        if( i == N-1 && j== N-1){
        if( K == arr[i][j]) return 1;
        return 0;
        } 

        if(dp[i][j][K] !=  0) return dp[i][j][K];
        long down = fun(N, K - arr[i][j], arr, i+1, j, dp);
        long right = fun(N, K - arr[i][j], arr, i, j+1, dp);  
        return dp[i][j][K] = down + right;

     }

    long numberOfPath(int N, int K, int [][]arr) {
        long  [][][] dp = new long[N][N][K+1];
        return fun(N, K, arr, 0, 0, dp);
    }    
}
