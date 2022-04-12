package com.company;

//https://codeforces.com/problemset/problem/1159/A

import java.util.Scanner;

public class aPileOfStones {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String st=scanner.nextLine();
        char[] x=st.toCharArray();
        int ans=0;
        for (int i = 0; i < x.length; i++) {

            if (x[i]== '+') ans++;
            else if (x[i]=='-' && ans!=0) ans--;
        }
        System.out.println(ans);
    }
}
