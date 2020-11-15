package org.bing.learn.leetcode;

public class 整数反转 {
    public static int reverse(int x) {
        int[] b=new int[33];
        if(x<0){
            x=-1*x;
        }
        String strX=String.valueOf(x);
        if(x<0){
            System.out.println("-");
        }
        System.out.println(strX.length());
//        for(int i=strX.length();i>0;i--){
//
//        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        return 0;
    }

    public static void main(String[] args){
        int x=123;
        reverse(x);
    }
}
