package com.company;

import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        scanner.nextLine();
        int c=0;
        String s=scanner.nextLine();
        char[] num=s.toCharArray();
        for (char value : num) {
            if (value == '8') c++;
        }
        System.out.println(Math.min(c, (x / 11)));
    }
}
