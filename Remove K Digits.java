class Solution {
    public String removeKdigits(String S, int K) {
     Stack<Character> st=new Stack<>();
	   int n=S.length();
	   
	   for(int i=0;i<n;i++) {
		   char c=S.charAt(i);
		   while(!st.isEmpty() && st.peek()>c && K>0) {
			   st.pop();
			   K--;
		   }
		   
		   if(!st.isEmpty() || c!='0') 
			   st.push(c);
	   }	   
	   
	   
	   while(!st.isEmpty() && K>0) {
		   st.pop();
		   K--;
	   }   	  
	   
	   if(st.size()==0)return "0";  
	   
	   StringBuilder ans=new StringBuilder();
	   for(char chr: st) 
		   ans.append(chr);
	   
	  return ans.toString();
    }
}
