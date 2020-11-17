package org.bing.learn.华为机试.字符串.计算字符个数HJ2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next().toLowerCase();
        String ch=scanner.next().toLowerCase();
        int num=0;
        for(char c:str.toCharArray()){
            if(String.valueOf(c).equals(ch)){
                num++;
            }
        }
        System.out.println(num);
    }
}
