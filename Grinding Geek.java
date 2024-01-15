class Solution {
    public int max_courses(int n, int total, int[] cost) {
        int dp[][]=new int[total+1][cost.length+1];
        
        return solve(cost,total,0,dp);
    }
    
    public static int solve(int [] cost,int total,int i,int dp[][]){
        
        if(i==cost.length)
            return 0;
            
        if(dp[total][i]!=0)
            return dp[total][i];
            
        int a=0,b=0,c=0;
        if(total>=cost[i]){
            
            a += 1+solve(cost,(total-cost[i])+(int)(Math.floor((0.9*cost[i]))),i+1,dp);
        }
        b=solve(cost,total,i+1,dp);
        
        return dp[total][i]=Math.max(a,b);
    }
}
