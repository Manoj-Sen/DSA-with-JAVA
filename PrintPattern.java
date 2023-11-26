package GFG;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        int N = scanner.nextInt();

        PrintPattern solution = new PrintPattern();
        List<Integer> result = solution.pattern(N);

        System.out.println("Resulting List: " + result);

        scanner.close();
	}
	
	public List<Integer> pattern(int N){
		List<Integer> ans = new ArrayList<>();
		insert(N,ans);
		return ans;
		
	}
	
	public static void insert(int n, List<Integer> ans) {
		ans.add(n);
		if(n<=0) return;
		insert(n-5,ans);
		ans.add(n);
	}

}
