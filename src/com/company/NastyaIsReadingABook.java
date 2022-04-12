package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class NastyaIsReadingABook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            arrayList.add(l);
            arrayList.add(r);
        }
        int k = scanner.nextInt();
        int gool=0;
        for (int i = 0; i < n*2; i+=2) {
            if (k>=arrayList.get(i) && k<=arrayList.get(i+1)) {
                gool=i/2;
                break;
            }
        }
        System.out.println(n-gool);
    }
}
