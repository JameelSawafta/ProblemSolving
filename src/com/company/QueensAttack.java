package com.company;

import java.util.Scanner;

public class QueensAttack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int q=scanner.nextInt();
        boolean[][] board=new boolean[n][n];
        for (int i = 0; i < q; i++) {
            int x0=scanner.nextInt();
            int y0=scanner.nextInt();
            int x=x0-1;
            int y=y0-1;
            if (board[x][y]==false) {
                System.out.println("YES");
                for (int i1 = 0; i1 < n; i1++) {
                    board[i1][y]=true;
                    board[x][i1]=true;
                    if (x+i1<n && y+i1<n)
                    board[x+i1][y+i1]=true;
                    if (x-i1>=0 && y-i1>=0)
                    board[x-i1][y-i1]=true;
                    if (x+i1<n && y-i1>=0)
                    board[x+i1][y-i1]=true;
                    if (x-i1>=0 && y+i1<n)
                    board[x-i1][y+i1]=true;
                }
            }
            else System.out.println("NO");
        }
    }

}
