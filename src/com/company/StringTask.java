package com.company;


import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String x=scanner.nextLine().toLowerCase();
        char[] y=x.toCharArray();
        for (char c : y) {
            if (c != 'a' && c != 'o' && c != 'y' && c != 'e' && c != 'u' && c != 'i') System.out.print("." + c);
        }
    }

}
