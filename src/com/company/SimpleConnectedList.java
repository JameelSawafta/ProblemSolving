package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleConnectedList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n-1];
        int[] b=new int[n-1];
        for (int i = 0; i < n-1; i++) {
            a[i]=scanner.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            b[i]=scanner.nextInt();
        }
        int[] a1=a.clone();
        int[] b1=b.clone();
        Arrays.sort(a1);
        Arrays.sort(b1);
        int start=0;
        int end=0;
        int startpoint=0;
        for (int i = 0; i < n-1; i++) {
            if (a1[i] != i + 1) {end = (a1[i] - 1);break;}
        }
        for (int i = 0; i < n-1; i++) {
            if (b1[i]!=i+1) {start=(b1[i]-1);break;}
        }
        for (int i = 0; i < n-1; i++) {
            if (a[i]==start) startpoint=i;
        }
        int x=0;
        //int y=0;
        for (int i = 0; i < n-2; i++) {
            if (a1[i]==a1[i+1] || b1[i]==b1[i+1]) {x++;break;}
            //if (a1[i] != i + 1) {y++;}
            //if (b1[i] != i + 1) {y++;}
        }

        if (a1[0]!=1 || x!=0) {
            System.out.println(-1);
        }
        else {
            for (int i = 0; i < n-1; i++) {
                System.out.print(a[startpoint]+" ");
                for (int j = 0; j < n-1; j++) {
                    if (b[startpoint]==a[j]) {startpoint=j;break;}
                }
            }
            System.out.print(end);
        }
    }
}
