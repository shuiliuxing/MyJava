package org.bing.learn.华为机试.字符串.进制转换HJ5;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String str=scan.next();
            int num=Integer.decode(str);
            System.out.println(num);
        }
    }
}
