import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = countStrings(n);
        System.out.println(res);
	}
	
    static long countStrings(int n) {
        // code here
        long mod = 1000000007;
        long f = 1;
        long s = 2;
        
        for(int i=2;i<=n;i++){
            long temp =  (f+s)%mod;
            f = s;
            s = temp;
        }
        return s;
    }
}
