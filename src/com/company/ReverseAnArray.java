package com.company;

// https://codeforces.com/group/yg7WhsFsAp/contest/355490/problem/P01

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int in=ss.nextInt();
        int[] x=new int[in];
        for (int i = 0; i < in; i++) {
            x[i]= ss.nextInt();
        }
        for (int i = (in-1); i >= 0; i--) {

            System.out.println(x[i]);
        }
    }
}