package com.company;

//https://codeforces.com/problemset/problem/1017/A

import java.util.Scanner;

public class TheRank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int order=1;
        int x=0;
        for (int i = 0; i < 4; i++) {
            x+=scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            int sum=0;
            for (int i1 = 0; i1 < 4; i1++) {
                sum+=scanner.nextInt();
            }
            if (sum>x) order++;

        }
        System.out.println(order);
    }
}
