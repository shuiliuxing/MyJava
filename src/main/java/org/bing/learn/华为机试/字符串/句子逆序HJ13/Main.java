package org.bing.learn.华为机试.字符串.句子逆序HJ13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] arr=scanner.nextLine().split(" ",-1);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
