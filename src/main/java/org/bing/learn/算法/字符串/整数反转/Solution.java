package org.bing.learn.算法.字符串.整数反转;

public class Solution {
    public static void main(String[] args){
        int x=-120;
        System.out.print(reverse(x));
    }

    public static int reverse(int x) {
        if(x<=-2147483648){
            return 0;
        }
        boolean flag=x<0?true:false;
        String s=String.valueOf(Math.abs(x));
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        long num=Long.valueOf(sb.toString());
        if(num<2147483647){
            if(flag){
                return -1*(int)(num);
            }else{
                return (int)(num);
            }
        }
        return 0;
    }

    //高效2--除模取余
    public static int reverse1(int x) {
        return 0;
    }
}
