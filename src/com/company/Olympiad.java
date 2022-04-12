package com.company;

//https://codeforces.com/problemset/problem/937/A

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Olympiad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        if (set.contains(0)) System.out.println(set.size()-1);
        else System.out.println(set.size());
    }
}
