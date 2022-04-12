package com.company;

//https://codeforces.com/problemset/problem/897/A

import java.util.Scanner;

public class ScarboroughFair {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        scanner.nextLine();
        String word =scanner.nextLine();
        //scanner.nextLine();
        char[] allchar=word.toCharArray();
        for (int i = 0; i < m; i++) {
            int x=scanner.nextInt()-1;
            int y=scanner.nextInt()-1;
            scanner.nextLine();
            char c1=scanner.next().charAt(0);
            char c2=scanner.next().charAt(0);
            for (int j = x; j <= y; j++) {
                if (allchar[j]==c1) allchar[j]=c2;
            }

        }
        word=String.valueOf(allchar);
        System.out.println(word);
    }
}
