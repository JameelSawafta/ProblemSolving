package com.company;

//https://codeforces.com/problemset/problem/984/A

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x=scanner.nextInt();
            arrayList.add(x);
        }
        for (int i = 0; i < n - 1; i+=2) {
            int max= Collections.max(arrayList);
            arrayList.remove(arrayList.indexOf(max));

            if (arrayList.size()==1)break;

            int min= Collections.min(arrayList);
            arrayList.remove(arrayList.indexOf(min));
        }
        System.out.println(arrayList.get(0));

    }
}
