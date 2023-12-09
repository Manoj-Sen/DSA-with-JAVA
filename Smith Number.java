public class Smith_Number {

	public static void main(String[] args) {
		int n = 378;
		System.out.println(smithnum(n));

	}
	
	/* Smith Number -  A Smith number is a composite number whose sum of digits is equal to
	 *  the sum of digits of its prime 
	 */
	
	static int smithnum(int n) {
		int sum = sumDigit(n);
		int sum2 = 0;
		if(isPrime(n)) return 0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				int s = sumDigit(i);
				while(n%i==0 && n>0) {
					sum2+=s;
					n/=i;
				}
			}
		}
		if(sum==sum2) return 1;
		
		return 0;
	}
	
	static int sumDigit(int x) {
		int sum = 0;
		while(x>0) {
			int digit = x%10;
			sum+=digit;
			x = x/10;
		}
		return sum;
	}
	
	static boolean isPrime(int n) {
		if(n<2)  return false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
