package org.bing.learn.华为机试.字符串.字符逆序HJ106;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String[] arr=scan.nextLine().split(" ");
        for(int i=arr.length-1; i>=0; i--){
            for(int j=arr[i].length()-1; j>=0; j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
