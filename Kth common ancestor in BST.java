class Solution {
    public void level(Node root,int x,int y,ArrayList<Integer> a)
    {
        if(root==null)
        return;
        a.add(root.data);
        if(x<root.data && y<root.data)
        level(root.left,x,y,a);
        if(x>root.data && y>root.data)
        level(root.right,x,y,a);
        return;
    }
    public int kthCommonAncestor(Node root, int k, int x, int y) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        level(root,x,y,a);
        return(a.size()-k>=0)?a.get(a.size()-k):-1;
    }
}
