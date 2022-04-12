package com.company;

import java.util.Scanner;

public class BestFactorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] fact={1,2,6,24,120,720,5040,40320,362880,3628800,39916800,479001600};
        int t=scanner.nextInt();

        for (int i = 0; i < t; i++) {int x=0;
            int n=scanner.nextInt();
            while (n!=0){
            for (int i1 = 11; i1 >= 0; i1--) {
                if (n >= fact[i1]) {n = n - fact[i1];x++;break;}
            }
            }
            System.out.println(x);
        }
    }
}
