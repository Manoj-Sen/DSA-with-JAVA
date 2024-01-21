
class Solution {
    public static void allSubsets(int i, int n, int[] arr, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        
        if(i == n){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        // Take
        list.add(arr[i]);
        allSubsets(i+1, n, arr, list, ans);
        
        // notTake
        if(list.size() > 0)
         list.remove(list.size()-1);
        
        allSubsets(i+1, n, arr, list, ans);
        
        
    }
    
    public static boolean allPresent(int[][] edges, ArrayList<Integer> list){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < list.size(); i++)set.add(list.get(i));
        for(int[] edge : edges){
            int v = edge[0];
            int u = edge[1];
            if((!set.contains(v)) && (!set.contains(u)))return false;
        }
        
        return true;
    }
    
    public static int vertexCover(int n, int m, int[][] edges) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)arr[i] = i+1;
        
        ArrayList<ArrayList<Integer>> subSets = new ArrayList<>();
        allSubsets(0, n, arr, new ArrayList<>(), subSets);
        
        int mini = n;
        
        for(ArrayList<Integer> list : subSets){
            if(allPresent(edges, list)){
                mini = Math.min(list.size(), mini);
            }
        }
        
        return mini;
    }
}
    
