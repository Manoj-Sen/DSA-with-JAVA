class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        int ans = 0;
        while(root!=null){
            ans = root.data;
            root = root.left;
        }
        return ans;
    }
}
