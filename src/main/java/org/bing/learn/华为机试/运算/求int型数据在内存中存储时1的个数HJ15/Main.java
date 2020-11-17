package org.bing.learn.华为机试.运算.求int型数据在内存中存储时1的个数HJ15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=Integer.toBinaryString(scan.nextInt());
        int num=0;
        for(char c:str.toCharArray()){
            if(c=='1'){
                num++;
            }
        }
        System.out.println(num);
    }
}
