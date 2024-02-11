class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        ans.add(0);
        
        for(int i=1; i<n; i++){
            int num = ans.get(i-1);
            if(num-i < 0 || set.contains(num-i)){
                ans.add(num+i);
                set.add(num+i);
            }else {
                ans.add(num-i);
                set.add(num-i);
            }
        }
        return ans;
    }
}
