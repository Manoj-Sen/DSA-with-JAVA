class Solution {
    public static int maxProfit(int n, int[] price) {
        int s1=0;int s2=0;
        int b1=Integer.MAX_VALUE;
        int b2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cur=price[i];
            b1=Math.min(b1,cur);
            s1=Math.max(s1,cur-b1);
            b2=Math.min(b2,cur-s1);
            s2=Math.max(s2,cur-b2);
            
        }
        return s2;
    }
}
