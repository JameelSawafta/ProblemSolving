package com.company;

//https://codeforces.com/problemset/problem/918/A

import java.util.ArrayList;
import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        int t =scanner.nextInt();
        if (t==1) {System.out.print("O");return;}
        else if (t==2){System.out.print("O");System.out.print("O");return;}
        System.out.print("O");
        System.out.print("O");
        for (int i = 3; i <= t; i++) {
            if (arrayList.get(arrayList.size()-1)+arrayList.get(arrayList.size()-2)==i) {
                System.out.print("O");
                arrayList.add(i);
            }
            else System.out.print("o");
        }
    }
}
