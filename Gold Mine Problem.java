class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        int mxGold = 0;
        for(int j=1;j<m;j++){
            for(int i=0;i<n;i++){
                int ans = Integer.MIN_VALUE;
                if(i-1>=0 && j-1>=0){
                    ans = Math.max(ans , M[i-1][j-1]);
                }
                if(j-1>=0){
                    ans = Math.max(ans, M[i][j-1]);
                }
                if(i+1<n && j-1>=0){
                    ans = Math.max(ans , M[i+1][j-1]);
                }
                M[i][j]+=ans;
                
                mxGold = Math.max(mxGold,M[i][j]);
            }
        }
        return mxGold;
    }
}
