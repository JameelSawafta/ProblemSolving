package com.company;

//https://codeforces.com/problemset/problem/1152/A


import java.util.Scanner;

public class NekoFindsGrapes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int evvA=0;
        int oddA=0;
        int evvB=0;
        int oddB=0;
        int x=0;
        for (int i = 0; i < n; i++) {
            int r=scanner.nextInt();
            if (r%2==0) evvA++;
            else oddA++;
        }
        for (int i = 0; i < m; i++) {
            int r=scanner.nextInt();
            if (r%2==0) evvB++;
            else oddB++;
        }
        x= Math.min(evvA,oddB)+Math.min(evvB,oddA);
        System.out.println(x);
    }
}
