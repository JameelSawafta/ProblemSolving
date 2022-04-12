package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximumProductStrikesBack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n=scanner.nextInt();
            LinkedList<Integer> linkedList=new LinkedList<>();
            int negNum=0;
            ArrayList<Integer> arrayList=new ArrayList<>();
            int max=1;
            for (int j = 0; j < linkedList.size(); j++) {
                int en=scanner.nextInt();
                linkedList.add(en);
                max*=en;
                if (en<0) {negNum++;arrayList.add(j);}
            }
            

        }
    }
}
