package com.company;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String x=scanner.nextLine().toLowerCase();
        String y=scanner.nextLine().toLowerCase();
        int a= x.compareTo(y);
        if (a<0) System.out.println(-1);
        else if (a>0) System.out.println(1);
        else System.out.println(0);
    }
}
