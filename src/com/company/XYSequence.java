package com.company;

//https://codeforces.com/contest/1657/problem/B

import java.util.Scanner;

public class XYSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n=scanner.nextInt();
            int b=scanner.nextInt();
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            long sum=0;int s=0;
            for (int i1 = 0; i1 < n; i1++) {
                if (s+x<=b) {s+=x;sum+=s;}
                else {s-=y;sum+=s;}
            }
            System.out.println(sum);
        }
    }
}
