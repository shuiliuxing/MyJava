package org.bing.learn.华为机试.字符串.字符串最后一个单词的长度HJ1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] arr=str.split(" ",-1);
        System.out.println(arr[arr.length-1].length());
    }
}
