class Solution {
    public static long sumOfPowers(long a, long b) {
        int ans = 0;
        
        for(long i=a;i<=b;i++){
            ans+=primes(i);
        }
        return ans;
    }
    
    static long primes(long n){
        int ans = 0;
        
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                ans++;
                n/=i;
            }
        }
        if(n!=1){
            ans++;
        }
        return ans;
    }
}
