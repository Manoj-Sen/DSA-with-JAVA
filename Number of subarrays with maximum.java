class Solution{
    
    static long countSubarrays(int a[], int n, int L, int R)  
    { 
        long ans = 0;
        long lessL=0 , btwLR = 0;
        
        for(int i=0 ;i<n; i++){
            if(a[i] < L){
                ans += btwLR;;
                lessL++;
            } else if(a[i] > R){
                btwLR=lessL=0;
            } else{
                ans += btwLR + lessL + 1;
                btwLR += lessL + 1;
                lessL = 0;
            }
        }
        return ans;
    } 
}
