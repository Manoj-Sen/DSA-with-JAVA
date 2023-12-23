class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        k = n/k;
        
        for(int x: arr){
        mp.put(x,mp.getOrDefault(x,0)+1);
            if(mp.get(x)>k){
                set.add(x);
            }
        }
        return set.size();
    }
}
