class GfG {
   public Node lowestCommonAncestor(Node root, int p, int q) {
        if (root == null || root.data == p || root.data == q) return root;

        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);
        
        if (left != null && right != null) return root;
        
        return left != null ? left : right;
    }
    
    public int distanceFromRoot(Node root, int x) {
        if (root == null) return -1;
        if (root.data == x) return 0;
        
        int leftDist = distanceFromRoot(root.left, x);
        int rightDist = distanceFromRoot(root.right, x);
        
        if (leftDist != -1) return leftDist + 1;
        if (rightDist != -1) return rightDist + 1;
        
        return -1;
    }
    
    public int findDist(Node root, int a, int b) {
        Node lca = lowestCommonAncestor(root, a, b);
        
        int distA = distanceFromRoot(lca, a);
        int distB = distanceFromRoot(lca, b);
        
        return distA + distB;
    }
}
