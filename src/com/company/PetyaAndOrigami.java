package com.company;

//https://codeforces.com/problemset/problem/1080/A

import java.util.Scanner;

public class PetyaAndOrigami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        Double[] sheets={n*2d,n*5d,n*8d};
        int num=0;
        for (int i = 0; i < 3; i++) {
            num += Math.ceil((Double) sheets[i]/k);
        }
        System.out.println(num);
    }
}
