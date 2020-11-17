package org.bing.learn.华为机试.字符串.字符串分隔HJ4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextLine()){
            String str=scan.nextLine();
            int len=str.length();
            if(len<=8){
                for(int i=len+1;i<=8;i++){
                    str+="0";
                }
                System.out.println(str);
            }else{
                int k=(int)(Math.ceil(len/8.0));
                for(int j=len+1;j<=8*k;j++){
                    str+="0";
                }
                for(int i=0;i<k;i++){
                    System.out.println(str.substring(i*8,(i+1)*8));
                }
            }
        }
    }
}
