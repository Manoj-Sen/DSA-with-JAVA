class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        if(n%k!=0){
            return 0;
        }
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i=i+k){
            String sub = s.substring(i,i+k);
            map.put(sub,map.getOrDefault(sub,0)+1);
        }
        
        int x = map.size();
        if(x==1) return 1;
        if(x==2) for(Integer val : map.values()) if(val==1) return 1;
        return 0;
        
    }
}
