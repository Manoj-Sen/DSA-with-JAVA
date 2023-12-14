import java.util.*;
class Solution
{
    static long countWays(int n,int k)
    {
        long mod = 1000000007;
        long same = 0;
        long diff = k;
        long total = same+diff;
        
        for(int i=2;i<=n;i++){
            same = diff;
            diff = (total*(k-1))%mod;
            total = (same+diff)%mod; 
        }
        return total;
    }
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      long res = countWays(n,k);
      System.out.println(res);
    }
}
