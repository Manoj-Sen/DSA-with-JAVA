package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        

        Pascal_Triangle pt = new Pascal_Triangle();
        ArrayList<Long> nthRow = pt.nthRowOfPascalTriangle(n);

        System.out.println("The nth row of Pascal's Triangle is: " + nthRow);
    }

    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long> pre = new ArrayList<>();
        long mod = 1000000007;

        for (int i = 0; i < n; i++) {
            ArrayList<Long> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1L);
                } else {
                    long num = (pre.get(j - 1) + pre.get(j)) % mod;
                    row.add(num);
                }
            }
            pre = row;
        }
        return pre;
    }
}
