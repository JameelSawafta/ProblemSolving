package com.company;

//https://codeforces.com/problemset/problem/1180/A

import java.util.Scanner;

public class AlexAndARhombus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int j=n-1;
        System.out.println(((n*n)+(j*j)));
    }
}
