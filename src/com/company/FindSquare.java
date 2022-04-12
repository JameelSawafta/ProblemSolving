package com.company;

//https://codeforces.com/problemset/problem/1028/A

import java.util.Scanner;

public class FindSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        scanner.nextLine();
        char[][] all=new char[x][y];
        int upA=0;
        int upB=0;
        int downA=0;
        int downB=0;
        for (int i = 0; i < x; i++) {
            String k=scanner.nextLine();
            all[i]=k.toCharArray();
        }

        f1:
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (all[i][j] == 'B') {upA = i+1;downA=j+1; break f1;}
            }
        }
        f2:
        for (int i = x-1; i >= 0; i--) {
            for (int j = y-1; j >= 0; j--) {
                if (all[i][j]=='B') {downB = j+1;upB=i+1; break f2;}
            }
        }
        System.out.print((upB+upA)/2+" "+(downB+downA)/2);
    }
}
