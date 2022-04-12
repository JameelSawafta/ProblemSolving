package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WarIsBad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        int t=scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int cou=0;
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            for (int i1 = 0; i1 < n; i1++) {
                arrayList.add(scanner.nextInt());
            }
            for (int i1 = 0; i1 < arrayList.size(); i1++) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i1==i2) continue;
                    else if (arrayList.get(i1)+arrayList.get(i2)<=m) {
                        arrayList.set(i1,arrayList.get(i1)+arrayList.get(i2));
                        arrayList.remove(i2);
                        cou++;
                        i2--;
                    }
                }
            }
            System.out.println(arrayList.size());
            arrayList.clear();
        }
    }
}
