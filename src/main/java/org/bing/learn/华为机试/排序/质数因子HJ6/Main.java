package org.bing.learn.华为机试.排序.质数因子HJ6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        for (long i=2; i<=num; i++) {
            if (num%i == 0) {
                System.out.print(i+" ");
                num/= i;
                i--;
            }
        }
    }
}
