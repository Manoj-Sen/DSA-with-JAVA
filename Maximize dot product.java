class Solution
{
	public int maxDotProduct(int n, int m, int a[], int b[]) 
	{ 
		// Your code goes here
		int[][] dp = new int[n+1][m+1];
		
		for(int i=0;i<=n;i++){
		    for(int j=0;j<=m;j++){
		        if(i==0 || j==0){
		            dp[i][j]=0;
		        }else if(i==j){
		            dp[i][j] = a[i-1]*b[j-1] + dp[i-1][j-1];
		        }else if(i>j){
		            dp[i][j] = Math.max(a[i-1]*b[j-1]+dp[i-1][j-1],dp[i-1][j]);
		        }
		    }
		}
		
		return dp[n][m];
	} 
}
