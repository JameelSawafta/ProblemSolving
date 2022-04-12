package com.company;

//https://codeforces.com/problemset/problem/832/A

import java.util.Scanner;

public class SashaAndSticks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long k=scanner.nextLong();
        if ((n/k)%2==0) System.out.println("NO");
        else System.out.println("YES");

    }
}
