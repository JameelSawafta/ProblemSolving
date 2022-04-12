package com.company;

//https://codeforces.com/problemset/problem/1088/A

import java.util.Scanner;

public class EhabAndAnotherConstructionProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int c=0;
        fors:
        for (int i = x; i > 0; i--) {
            for (int j = x; j > 0; j--) {
                if (i%j==0 && i*j>x && i/j<x) {System.out.println(i);System.out.println(j);c++;break fors;}
            }
        }
        if (c==0) System.out.println(-1);
    }
}
