class Solution
{
    
    int absolute_diff(Node root)
    {
        min = Integer.MAX_VALUE;
        pre = -1;
        
        inorder(root);
        
        return min;
    }
    
    int min,pre;
    
    void inorder(Node root){
        if(root!=null){
            
            inorder(root.left);
            
            if(pre==-1){
                pre = root.data;
            }else{
                min = Math.min(min,root.data-pre);
                pre = root.data;
            }
            
            inorder(root.right);
        }
    }
}
