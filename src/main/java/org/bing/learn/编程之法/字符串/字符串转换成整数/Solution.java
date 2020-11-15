package org.bing.learn.编程之法.字符串.字符串转换成整数;

public class Solution {
    public static void main(String[] args){
        String str="647";
        System.out.println(strToInt(str));
    }


    //暴力轮询
    public static int strToInt(String str) {
        //判断是否是负数
        char first=str.charAt(0);
        boolean flag=false;
        if(first=='-'){
            flag=true;
        }
        //结果数
        int sum=0;
        int k=0;
        for(char ch:str.toCharArray()){
            //判断是否溢出（正数）
            if(!flag && sum >=2147483640 && ch>='8'){
                return Integer.MAX_VALUE;
            }
            if(flag && sum>=2147483640 && ch>='9'){
                return Integer.MIN_VALUE;
            }
            if(ch!='-') {
                int num = ch - '0';
                if(!flag) {
                    sum += Math.pow(10, str.length() - 1 - k) * num;
                }else{
                    sum+=-1 *(Math.pow(10, str.length() - 1 - k) * num);
                }
            }
            k++;
        }
        return sum;
    }
}
