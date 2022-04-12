package com.company;

//https://codeforces.com/problemset/problem/987/A

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InfinityGauntlet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        Map<String,String> map=new HashMap<>();
        map.put("purple","Power");
        map.put("green","Time");
        map.put("blue","Space");
        map.put("orange","Soul");
        map.put("red","Reality");
        map.put("yellow","Mind");
        for (int i = 0; i < n; i++) {
            String y=scanner.nextLine();
            if(map.containsKey(y)) map.remove(y);
        }
        System.out.println(map.size());
        for (String o: map.values()){
            System.out.println(o);
        }

    }
}
