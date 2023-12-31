class Solution {
    public static boolean isPossible(int N, int[] coins) {
        // code here
        int sum=0;
        for(int i=0;i<N;i++)sum+=coins[i];
        int dp[][] = new int[N][sum];
        for(int []temp:dp){
            Arrays.fill(temp,-1);
        }
        sum=0;
        return help(N,coins,sum,0,dp)!=0;
    }
    static int help(int N,int coins[],int sum,int index,int dp[][]){
        if(sum!=0 && (sum%20==0 || sum%24==0 || sum==2024))return 1;
        if(index==N)return 0;
        if(dp[index][sum]!=-1)return dp[index][sum];
        sum+=coins[index];
        int a = help(N,coins,sum,index+1,dp);
        sum-=coins[index];
        int b = help(N,coins,sum,index+1,dp);
        return dp[index][sum] = a|b;
    }
}
