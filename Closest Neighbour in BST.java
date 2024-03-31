class Solution {
    public static int findMaxForN(Node root, int n) {
        int max=-1;
        while(root!=null){
            if(root.key<=n){
                max=root.key;
                root=root.right;
            }
            else{
                root=root.left;
            }
                
        }
        return max;
    }
}
