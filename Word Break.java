public static int wordBreak(String A, ArrayList<String> B )
    {
        int n = A.length();
        int[] dp = new int[n+1];
        dp[n] = 1;
        
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<B.size(); j++){
                String cur = B.get(j);
                
                if(i+cur.length() <= n && 
                    A.substring(i, i+cur.length()).equals(cur) &&
                    dp[i+cur.length()] == 1){
                        dp[i] = 1;
                }
                
            }
        }
        
        return dp[0];
    }
