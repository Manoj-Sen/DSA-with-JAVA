public class largestElementArray {
    public static void main(String args[]){
        int arr[] = {2,4,7,2,4,5};
        int res = LargestElement(arr);
        System.out.println(res);
    }

    public static int LargestElement(int arr[] ){
            int largest  = arr[0];
            int n = arr.length;
            for(int i =1; i<n; i++){
                if(arr[i] > largest){
                    largest = arr[i];
                }
            }
            return largest;
        }
}
