package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatingTheContest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        int n=scanner.nextInt();
        int x=1;
        int num=0;
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        for (int i = 0; i < n-1; i++) {
            if (a.get(i)*2 >= a.get(i+1)) {x++;num=Math.max(num,x);}
            else x=1;
        }
        System.out.println(num);
    }
}
