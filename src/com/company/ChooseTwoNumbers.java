package com.company;

//https://codeforces.com/problemset/problem/1206/A

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChooseTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int m=scanner.nextInt();
        ArrayList<Integer> b=new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b.add(scanner.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b);
        fors:
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                int k=a.get(i)+b.get(i1);
                if (a.indexOf(k)==-1 && b.indexOf(k)==-1) {
                    System.out.println(a.get(i));
                    System.out.println(b.get(i1));
                    break fors;
                }
            }
        }
    }
}
