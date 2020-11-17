package org.bing.learn.华为机试.字符串.数字颠倒HJ11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] arr=scanner.next().toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
