class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        
        int i=0;
        
        while(true){
            int index=txt.indexOf(pat,i);
            
            if(index==-1){
                break;
            }
            else{
                ans.add(index+1);
                i=index+1;
            }
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
    }
}
