class Solution
{
	public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		inorder(root1 , set1);
		inorder(root2 , set2);
		
		int count= 0;
		for(int num: set1){
		    if(set2.contains(x-num))
		       count++;
		}
		return count;
	}
	
	static void inorder(Node root , Set<Integer> set){
	    if(root==null){
	        return ;
	    }
	    inorder(root.left , set);
	    set.add(root.data);
	    inorder(root.right , set);
	}
}
