package com.company;

//https://codeforces.com/problemset/problem/994/A

import java.util.Scanner;

public class Fingerprints {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];;
        for (int i = 0; i < n; i++) {
            int x=scanner.nextInt();
            a[i]=x;
        }
        for (int i = 0; i < m; i++) {
            int x=scanner.nextInt();
            b[i]=x;
        }
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                if (a[i]==b[i1]) {System.out.println(b[i1]);break;}
            }
        }
    }
}
