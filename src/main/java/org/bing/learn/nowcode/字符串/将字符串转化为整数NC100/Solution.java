package org.bing.learn.nowcode.字符串.将字符串转化为整数NC100;

public class Solution {
    public static void main(String[] args){
        String str="       -10441643317j";
        System.out.println(atoi(str));
    }

    public static int atoi (String str) {
        //处理无效字符
        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='+' || c=='-' || (c>='0' && c<='9')){
                sb.append(c);
            }else if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                break;
            }
        }
        str=sb.toString();
        boolean flag=true;
        int start=0;
        int n=str.length();
        long sum=0;
        //为空返回-1
        if(n==0 || str.equals("")){
            return 0;
        }
        //第一个是"-"号
        if(str.charAt(0)=='-'){
            flag=false;
            start=1;
        }
        //第一个是"+"号，或"0"
        else if(str.charAt(0)=='+' || str.charAt(0)=='0'){
            start=1;
        }
        for(int i=start;i<n;i++){
            int num=str.charAt(i)-'0';
            sum+=num*Math.pow(10,n-i-1);
            //判断是否溢出
            if(flag && sum>=Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(!flag && -1*sum<=Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        if(!flag){
            sum=-1*sum;
        }
        return (int)sum;
    }
}
