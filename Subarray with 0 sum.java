import java.util.8;

public class Subarray_0_Sum {

	public static void main(String[] args) {
		int arr[] = {4,2,-3,1,6};
		System.out.println(findsum(arr));

	}
	 static boolean findsum(int arr[])
	    {
	        int n = arr.length;
	        Set<Integer> s = new HashSet<Integer>();
	        for(int i=1;i<n;i++){
	            arr[i] = arr[i] + arr[i-1];
	        }
	       
	       for(int i=0;i<n;i++){
	           s.add(arr[i]);
	           
	           if(arr[i] == 0){
	               return true;       
	           }
	       }  
	        if(s.size() != arr.length){
	            return true;
	            }
	        else{
	            return false;
	        }       
	    }
}
