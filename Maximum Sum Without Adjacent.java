class Solution {
    int findMaxSum(int arr[], int n) {
        if(n==1) return arr[0];
        
        for(int i=2;i<n;i++){
            arr[i] = arr[i] + arr[i-2];
            arr[i-1] = Math.max(arr[i-1],arr[i-2]);
        }
        return Math.max(arr[n-1] , arr[n-2]);
    }
}
