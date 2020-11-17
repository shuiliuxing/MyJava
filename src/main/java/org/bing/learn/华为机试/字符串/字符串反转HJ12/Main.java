package org.bing.learn.华为机试.字符串.字符串反转HJ12;

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
