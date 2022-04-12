package com.company;

//https://codeforces.com/problemset/problem/1191/A

import java.util.Scanner;

public class TokitsukazeAndEnhancement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        if (n%4==1) {
            System.out.println(0);
            System.out.println("A");
        }
        else if (n%4==3) {
            if ((n+1)%4==1) {
                System.out.println(1);
                System.out.println("A");
            }
            else if ((n+2)%4==1) {
                System.out.println(2);
                System.out.println("A");
            }
            else {
                System.out.println(0);
                System.out.println("B");
            }
        }
        else if (n%4==2) {
            if ((n+1)%4==1) {
                System.out.println(1);
                System.out.println("A");
            }
            else if ((n+1)%4==3){
                if ((n+2)%4==1){
                    System.out.println(2);
                    System.out.println("A");
                }
                else {
                    System.out.println(1);
                    System.out.println("B");
                }
            }
            else {
                System.out.println(0);
                System.out.println("B");
            }
        }
        else if (n%4==0){
            if ((n+1)%4==1) {
                System.out.println(1);
                System.out.println("A");
            }
            else if ((n+1)%4==3){
                if ((n+2)%4==1){
                    System.out.println(2);
                    System.out.println("A");
                }
                else {
                    System.out.println(1);
                    System.out.println("B");
                }
            }
            else if ((n+1)%4==2){
                if ((n+2)%4==1){
                    System.out.println(2);
                    System.out.println("A");
                }
                else if ((n+2)%4==3){
                    if ((n+3)%4==1){
                        System.out.println(3);
                        System.out.println("A");
                    }
                    else {
                        System.out.println(2);
                        System.out.println("B");
                    }
                }
            }
            else {
                System.out.println(0);
                System.out.println("D");
            }
        }

    }
}
