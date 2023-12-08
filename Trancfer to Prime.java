public class Convert_to_Prime {

	public static void main(String[] args) {
		int [] arr = {2, 4, 6, 8, 12};
		System.out.println(convertPrime(arr));

	}
	static int convertPrime(int [] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		int count = 0;
		int max = Integer.MAX_VALUE;
		for(int i=sum;i<max;i++) {
			if(isPrime(sum)) {
				return count;
			}else {
				sum++;
				count++;
			}
		}
		return -1;
	}
	
	static boolean isPrime(int n) {
		if (n < 2) 
            return false; 
  
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
	}
}
