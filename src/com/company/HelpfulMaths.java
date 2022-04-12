package com.company;

//https://codeforces.com/group/yg7WhsFsAp/contest/355490/problem/P06

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String x=scanner.nextLine();
        char[] y=x.toCharArray();
        char[] z=new char[ y.length/2+1];
        for (int i = 0; i < y.length-1; i+=2) {
            z[i/2]=y[i];
        }
        z[ y.length/2]=y[y.length-1];
        Arrays.sort(z);
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            if (i!= z.length-1) System.out.print("+");
        }

    }
}
