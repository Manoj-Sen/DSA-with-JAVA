class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        int start = 0;
        int end = n - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid + 1 < n && arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else if (mid - 1 >= 0 && arr[mid - 1] > arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
}
