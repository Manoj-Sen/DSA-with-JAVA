import java.util.Arrays;

public class Candy {

	public static void main(String[] args) {
		int arr[] = {1,2,2};
		int res = candy(arr);
		System.out.println(res);
	}
	
	static int candy(int[] arr) {
		int n = arr.length;
		
		int [] candy = new int[n];
		Arrays.fill(candy, 1);
		
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				candy[i] = candy[i-1] + 1;
			}
		}
		
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>arr[i+1]) {
				candy[i] = Math.max(candy[i+1] + 1,candy[i]);
			}
		}
		
		int count = 0;
		for(int i=0;i<n;i++) {
			count+=candy[i];
		}
		return count;
	}
}
