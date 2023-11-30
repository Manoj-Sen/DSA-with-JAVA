package GFG;

import java.util.Scanner;

public class Sortest_Path {

	public static void main(String[] args) {
		System.out.print("Number of vertices : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int res = minStep(a);
		System.out.println("Length of sortest path : " + res);

	}
	
	//Shortest path from 1 to n
	public static int minStep(int n) {
		int ans = 0;
		
		while(n>1) {
			if(n%3==0) {
				n/=3;
			}else {
				n--;
			}
			ans++;
		}
		return ans;
	}

}
