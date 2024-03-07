class Solution {
    boolean sameFreq(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        HashMap<Integer,Integer> ml = new HashMap<>();
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        for(char x :m.keySet()){
            h.add(m.get(x));
            ml.put(m.get(x),ml.getOrDefault(m.get(x),0)+1);
        }
        if(h.size() > 2){
            return false;
        }
        if(h.size() == 1){
            return true;
        }
        ArrayList<Integer> l = new ArrayList<>(h);
        if(Math.abs(l.get(0) - l.get(1)) == 1){
            if(l.get(0) > l.get(1)){
                if(ml.get(l.get(0)) == 1){
                    return true;
                }
            }
            else{
                if(ml.get(l.get(1)) == 1){
                    return true;
                }
            }
        }
        if((l.get(0)==1 || l.get(1)==1) && ml.get(1) == 1){
            return true;
        }
        return false;
    }
}
