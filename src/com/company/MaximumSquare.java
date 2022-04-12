package com.company;

//https://codeforces.com/problemset/problem/1243/A

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        int t =scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n=scanner.nextInt();
            arrayList.clear();
            for (int i1 = 0; i1 < n; i1++) {
                int x=scanner.nextInt();
                arrayList.add(x);
            }
            Collections.sort(arrayList);

            int cou= 0;
            int x=arrayList.get(arrayList.size()-1);
            fors:
            for (int i1 = arrayList.size()-1; i1 >= 0; i1--) {
                for (int i2 = arrayList.size()-1; i2 >= 0; i2--) {
                    if (x<=arrayList.get(i2)) {
                        cou++;
                        if (x==cou) {System.out.println(x); break fors;}
                    }
                    else if (x>=cou) {cou=0;break;}
                    else {System.out.println(x); break fors;}
                }
                x--;
            }
        }
    }
}
