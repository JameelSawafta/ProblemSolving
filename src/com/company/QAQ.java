package com.company;

//https://codeforces.com/problemset/problem/894/A

import java.util.Scanner;

public class QAQ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);;
        String en=scanner.nextLine();
        char[] array=en.toCharArray();
        int x=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!='Q') continue;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]!='A') continue;
                for (int r = j+1; r < array.length; r++) {
                    if (array[r]=='Q') x++;
                }
            }
        }
        System.out.println(x);
    }
}
