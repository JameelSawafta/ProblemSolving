package com.company;

//https://codeforces.com/problemset/problem/1220/A

import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        scanner.nextLine();
        String word=scanner.nextLine();
        char[] allchar=word.toCharArray();
        int o=0;
        int n=0;
        int e=0;
        int z=0;
        int r=0;
        int zero=0;
        int one=0;
        for (int i = 0; i < allchar.length; i++) {
            if (allchar[i] == 'n') n++;
            else if (allchar[i] == 'z') z++;
            else if (allchar[i] == 'r') r++;
            else if (allchar[i] == 'o') o++;
            else if (allchar[i] == 'e') e++;
            if (o >= 1 && n >= 1 && e >= 1) {
                one++;
                o--;
                n--;
                e--;
            }
            else if (z >= 1 && e >= 1 && r >= 1 && o >= 1) {
                zero++;
                z--;
                e--;
                r--;
                o--;
            }
        }
        for (int i = 0; i < one; i++) {
            System.out.println(1);
        }
        for (int i = 0; i < zero; i++) {
            System.out.println(0);
        }
    }
}
