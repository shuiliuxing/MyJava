package org.bing.learn.华为机试.运算.汽水瓶HJ22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while (scan.hasNext()){
            int n=scan.nextInt();
            if(n!=0){
                System.out.println(n/2);
            }
        }
    }
}
