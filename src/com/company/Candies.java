package com.company;


import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int in=ss.nextInt();
        int[] x=new int[in];
        int sum=0;
        for (int i = 0; i < in; i++) {
            x[i]=ss.nextInt();
        }int p1= ss.nextInt();int p2= ss.nextInt();
        for (int i = p1; i <= p2; i++) {
            sum+=x[i];
        }
        System.out.println(sum);
    }
}