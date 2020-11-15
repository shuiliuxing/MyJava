package org.bing.learn.编程之法.字符串.字符串的包含;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args){
        String a="abcdef";
        String b="f";
        System.out.println(contain2(a,b));
    }


    //暴力轮询
    public static boolean contain1(String a, String b){
        for(int i=0;i<b.length();i++){
            int j;
            for(j=0;j<a.length();j++){
                if(b.charAt(i)==a.charAt(j)){
                    break;
                }
            }
            if(j==a.length()){
                return false;
            }
        }
        return true;
    }

    //使用Map
    public static boolean contain2(String a, String b){
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<a.length();i++){
            map.put(a.charAt(i),1);
        }
        int i;
        for(i=0;i<b.length();i++){
            if(map.get(b.charAt(i))==null){
                break;
            }
        }
        if(i==b.length()){
            return true;
        }
        return false;
    }

    //非该题解法
    public static boolean otherContain(String a, String b){
        int n=a.length();
        int len=b.length();
        int k=0;
        for(int i=0; i<n&k<len; i++){
            if(a.charAt(i)==b.charAt(k)){
                k++;
            }else{
                k=0;
            }
        }
        if(k==len){
            return true;
        }
        return false;
    }
}
