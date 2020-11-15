package org.bing.learn.算法.字符串.字符串转换整数atoi;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args){
        String str="2.33";
        System.out.println(myAtoi(str));
    }
    //使用正则表达式
    public static int myAtoi(String str) {
        String regex="^\\s*([+-]?\\d+)";
        Pattern pt=Pattern.compile(regex);
        Matcher m=pt.matcher(str);
        if(!m.find()){
            return 0;
        }
        BigInteger num=new BigInteger(m.group(1));
        if(num.compareTo(new BigInteger("-2147483647"))<0){
            return Integer.MIN_VALUE;
        }else if(num.compareTo(new BigInteger("2147483647"))>0){
            return Integer.MAX_VALUE;
        }
        return num.intValue();
    }

    //没通过，要考虑点太多了
    public static int myAtoi1(String str) {
        str=str.replace(" ","");
        String s="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(i==0 && Character.isLetter(c)){
                return 0;
            }else if(Character.isDigit(c) || c=='-' || c=='.'){
                s+=c;
            }
        }
        if(s.length()==0 || s.equals("-")){
            return 0;
        }
        double num=Double.valueOf(s);
        if(num<-2147483648){
            return -2147483648;
        }else if(num>2147483647){
            return 2147483647;
        }
        return (int)num;
    }

}
