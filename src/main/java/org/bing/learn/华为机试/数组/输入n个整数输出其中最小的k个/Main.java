package org.bing.learn.华为机试.数组.输入n个整数输出其中最小的k个;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
