package com.company;

//https://codeforces.com/problemset/problem/1269/A

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int u=199999996-n;
        if (!isPrime(u))
            System.out.println((199999996)+" "+u);
        else System.out.println((199999996-1)+" "+(u-1));
    }
    public static boolean  isPrime(long n)
    {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }
}
