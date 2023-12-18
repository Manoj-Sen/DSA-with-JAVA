class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        Set<Integer> ans = new HashSet<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        
        while(i<n && j<m){
            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        
        int res = ans.size();
        return res;
    }
};
