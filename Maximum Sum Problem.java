class Solution
{
    public int maxSum(int n) 
    { 
        if(n==0) return 0;
        
        int[] t = new int[n+1];
        
        t[0] = 0;
        t[1] = 1;
        for(int i=2;i<n+1;i++){
            t[i] = Math.max(t[i/2] + t[i/3] + t[i/4] , i);
        }
        
        return t[n];
    } 
}
