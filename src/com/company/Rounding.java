package com.company;

//https://codeforces.com/problemset/problem/898/A

import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int num=x%10;
        int k=x/10;
        if (num>5) {k++;k=k*10;}
        else k=k*10;
        System.out.println(k);
    }
}
