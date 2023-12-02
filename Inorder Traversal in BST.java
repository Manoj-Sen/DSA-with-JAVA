import java.util.*;
public class Solution
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int [] arr = new int[5];
	    for(int i=0;i<arr.length;i++){
	        arr[i] = sc.nextInt();
	    }

	    int res = isRepresentingBST(arr);
	    System.out.println(res);
	}
	 static int isRepresentingBST(int arr[])
    {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] >= arr[i+1]){
                return 0;
            }
        }
        return 1;
    }
}
