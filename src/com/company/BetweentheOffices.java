package com.company;

//https://codeforces.com/problemset/problem/867/A

import java.util.Scanner;

public class BetweentheOffices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        scanner.nextLine();
        int sf=0;
        int fs=0;
        char[] allchar=scanner.nextLine().toLowerCase().toCharArray();
        for (int i = 0; i < allchar.length-1; i++) {
            if (allchar[i]=='s' && allchar[i+1]=='f') sf++;
            else if (allchar[i]=='f' && allchar[i+1]=='s') fs++;
        }
        if (sf>fs) System.out.println("YES");
        else System.out.println("NO");
    }
}
