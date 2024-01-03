class Solution {
    public int smallestSubstring(String S) {
        int zero=-1,one=-1,two=-1;
        int res = 10001;
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='0')  zero=i;
            if(S.charAt(i)=='1')  one=i;
            if(S.charAt(i)=='2')  two=i;
            
            if(zero==-1||one==-1||two==-1) continue;

            //FInd the length of substring
            int min = Math.min(Math.min(one,two),zero);
            int max = Math.max(Math.max(one,two),zero);
            res = Math.min(res , max-min+1);
        }
        return res==10001?-1:res;
    }
};
