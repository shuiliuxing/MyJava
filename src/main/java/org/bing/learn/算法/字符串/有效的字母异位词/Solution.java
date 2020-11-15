package org.bing.learn.算法.字符串.有效的字母异位词;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        String s="anagram";
        String t="nagajam";
        System.out.println(isAnagram1(s,t));

    }

    //超时
    public static boolean isAnagram(String s, String t){
        int sLen=s.length();
        int tLen=t.length();
        if(sLen!=tLen){
            return false;
        }
        boolean[] flag=new boolean[sLen];
        int num=0;
        for(int i=0;i<sLen;i++){
            char c=s.charAt(i);
            for(int j=0;j<tLen;j++){
                if(flag[j]==false && c==t.charAt(j)){
                    flag[j]=true;
                    num++;
                    break;
                }
            }
        }
        if(num==sLen){
            return true;
        }
        return false;
    }

    //最简单
    public static boolean isAnagram1(String s, String t){
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return String.valueOf(sc).equals(String.valueOf(tc));
    }
}
