package com.company;

/**
 * User: Jameel Sawafta
 * Date: 4/6/2022
 * Time: 11:03 PM
 * ProblemLink: https://codeforces.com/group/nm0n1RosrQ/contest/375698/problem/D
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CollectCoins {

    static void solve() throws Exception {
        int n=scanInt();
        int k=scanInt();
        ArrayList<Integer> arrayList=new ArrayList<>();
        int odd=0 ,even=0;
        for (int i = 0; i < n; i++) {
            int x=scanInt();
            arrayList.add(x);
            if (x>0) even++;
            else odd++;
        }
        Collections.sort(arrayList);
//        int uy=0;
//        for (int i = 0; i < n; i++) {
//            if (arrayList.get(i)%2==0){uy=i;break;}
//        }


        if (even==arrayList.size()) System.out.println(arrayList.get(k-1));
        else if (odd==arrayList.size()) System.out.println(0-(arrayList.get(arrayList.size()-k)));
        else {
//            int kNew=Math.min(uy-k,arrayList.size());
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {

                if (arrayList.get(i)<0 && arrayList.get(i+k-1)<=0 ) {
                    if (-1*arrayList.get(i)<min)
                    min=(-1*arrayList.get(i));
                }
                else if (arrayList.get(i)>=0 && arrayList.get(i+k-1)>0 )
                { if (arrayList.get(i+k-1)<min)
                    min=arrayList.get(i+k-1);}
                else {
                    if (-arrayList.get(i)>arrayList.get(i+k-1) && (2*arrayList.get(i+k-1)+(-1*arrayList.get(i)))<min) min=2*arrayList.get(i+k-1)+(-1*arrayList.get(i));
                    else if (-arrayList.get(i)<arrayList.get(i+k-1) && (arrayList.get(i+k-1)+(-2*arrayList.get(i)))<min) min=arrayList.get(i+k-1)+(-2*arrayList.get(i));

                }
                if (i+k-1==arrayList.size()-1)break ;

            }
            System.out.println(min);
        }
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }

    // for array
    public static void swap(int index, int index2, int[] a) {
        int t = a[index2];
        a[index2] = a[index];
        a[index] = t;
    }

    //for Arraylist
    public static void swap(int index, int index2, ArrayList<Integer> a) {
        int t = a.get(index2);
        a.set(index2, a.get(index));
        a.set(index, t);
    }

    private static void addRandomNumbers(ArrayList<Integer> a, int noOfElements, int bound) {
        Random rand = new Random();
        for (int i = 0; i < noOfElements; i++) {
            a.add(rand.nextInt(bound));
        }
    }

    public static void printArray(ArrayList<Integer> a) {

        for (int i = 0; i < a.size(); i++) {
            Integer y = a.get(i);
            System.out.print(y + "\t");
        }

        System.out.println();
    }

    private static boolean isSorted(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > array.get(i + 1))
                return false;
        }
        return true;
    }

    private static void copyArrays(int[] a, int start, int end, int[] temp) {
        for (int i = start; i <= end; i++) {
            temp[i - start] = a[i];
        }
    }

    private static boolean isEven(int num) {
        return ((num & 1) == 0 ? true : false);
    }

    /* Method to check if x is power of 2*/
    private static boolean isPowerOfTwo(int x) {
        return x != 0 && ((x & (x - 1)) == 0);
    }

    //Calculating the number of digits
    private static int numOfDigits(int num) {
        return (int) Math.floor(Math.log10(num)) + 1;
    }

    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    private static void countSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    private static void countSort(ArrayList<Integer> arr) {
        int max = Collections.max(arr);
        int min = Collections.min(arr);
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            count[arr.get(i) - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            output[count[arr.get(i) - min] - 1] = arr.get(i);
            count[arr.get(i) - min]--;
        }

        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, output[i]);
        }
    }
}