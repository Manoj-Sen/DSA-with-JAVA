class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        HashSet<Character> a = new HashSet<>();
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)-'a' >=0 && s.charAt(i)-'a'<=25){
                a.add(s.charAt(i));
            }
            if(a.size()==26){
                return true;
            }
        }
        return false;


    }
}
