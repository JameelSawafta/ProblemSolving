package com.company;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int l=scanner.nextInt();
        int a=scanner.nextInt();
        int z=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            int ti= scanner.nextInt();
            int li= scanner.nextInt();

            count += (ti-z)/a;
            z = ti+li;
        }

        int u =(l-z)/a;

        System.out.println(count+u);

    }
}
