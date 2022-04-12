package com.company;

//https://codeforces.com/contest/1657/problem/A

import java.util.Scanner;

public class IntegerMoves {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t =scanner.nextInt();
        int best=0;
        for (int i = 0; i < t; i++) {
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            double p =  Math.sqrt(x*x+y*y);
            int counter=1;
            if (x==0 && y==0) System.out.println(0);
            else if (p == (int)p) System.out.println(1);
            else{
                System.out.println(2);
            }
        }
    }
}
