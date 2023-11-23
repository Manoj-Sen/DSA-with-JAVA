package com.company;

public class Length_Last_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = lengthOfLastWord(" Hello world ");
		System.out.println(r);
		

	}
	public static int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count = 0;
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }

}

    