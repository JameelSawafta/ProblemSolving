package com.company;

//https://codeforces.com/problemset/problem/935/A

import java.util.Scanner;

public class FafaAndHisCompany {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int sum=0;
        int y=1;
        for (int i = x-1; i > 0; i--,y++) {
            if (i%y==0) sum++;
        }
        System.out.println(sum);
    }
}
