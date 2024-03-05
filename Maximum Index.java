class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        int i=0,j=n-1,max=0;
        while(i<=j){
            if (a[i]<=a[j] ) { 
                max=Math.max(max,j-i);
                j=n-1; 
                i++;
            }
            else j--;
        }       
        return max;     
    }
}


