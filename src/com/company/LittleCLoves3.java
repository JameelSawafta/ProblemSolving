package com.company;

//https://codeforces.com/problemset/problem/1047/A

import java.util.Scanner;

public class LittleCLoves3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if ((n-2)%3!=0) System.out.println(1+" "+1+" "+(n-2));
        else System.out.println(1+" "+2+" "+(n-3));
    }
}
