package com.company;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String x=scanner.nextLine();
        int count=0;
        char y=x.charAt(0);
        for (int i = 0; i < x.length(); i++) {
            if (y==x.charAt(i)) ++count;
            else {
                y=x.charAt(i);
                count=0;}
            if (count>=6) break;
        }
        if (count>=6) System.out.println("YES");
        else System.out.println("NO");
    }
}
//101010001001111111001001
