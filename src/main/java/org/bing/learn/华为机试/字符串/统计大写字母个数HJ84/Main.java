package org.bing.learn.华为机试.字符串.统计大写字母个数HJ84;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while (scan.hasNextLine()){
            char[] arr=scan.nextLine().toCharArray();
            int num=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>='A' && arr[i]<='Z'){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
