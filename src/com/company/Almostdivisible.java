package com.company;

import java.util.Scanner;

public class Almostdivisible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int a=0;
        int b=0;
        for (int i = 0; i < t; i++) {
            int n=scanner.nextInt();
            int[] array=new int[n];
            for (int i1 = 0; i1 < n; i1++) {
                array[i1]=scanner.nextInt();
            }
            for (int i1 = 0; i1 < n; i1++) {
                for (int i2 = 0; i2 < n; i2++) {
                    if (array[i1] % array[i2]==array[i2]-1) {a=array[i1];b=array[i2];}
                }
            }
            System.out.println(a+" "+b);
        }
    }
}
