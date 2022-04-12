package com.company;

//https://codeforces.com/group/yg7WhsFsAp/contest/355490/problem/P03

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < a; i++) {
            String x=scanner.nextLine();
            char[] y=x.toCharArray();
            if (x.length()<=10) System.out.println(x);
            else
            System.out.println( y[0]+""+(y.length-2)+""+ y[y.length-1]);
        }
    }
}
