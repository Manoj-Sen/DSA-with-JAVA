import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = nthPoint(n);
        System.out.println(res);
	}
	
	static int nthPoint(int n)
    {
        int mod = 1000000007;
        int first = 1;
        int second = 2;
        
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        
        for(int i=3;i<=n;i++){
            int total = (first+second)%mod;
            first = second;
            second = total;
        }
        return second;
    }
}
