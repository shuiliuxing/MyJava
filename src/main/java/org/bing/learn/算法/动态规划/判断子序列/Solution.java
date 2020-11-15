package org.bing.learn.算法.动态规划.判断子序列;
/*
给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。

示例 1:
s = "abc", t = "ahbgdc"
返回 true.

示例 2:
s = "axc", t = "ahbgdc"
返回 false.
 */
public class Solution {
    public static void main(String[] args){
        String s="abc";
        String t="ahbgdc";
        System.out.println(dp(s,t));
    }

    //方法一
    public static boolean isSubsequence1(String s, String t){
        int num=0;
        int sLen=s.length();
        int tLen=t.length();
        int m=0;
        for(int i=0;i<sLen;i++){
            for(int j=m;j<tLen;j++){
                if(s.charAt(i)==t.charAt(j)){
                    m=j+1;
                    num++;
                    break;
                }
            }
        }
        if(num==s.length()){
            return true;
        }
        return false;
    }


    //方法2
    public static boolean isSubsequence2(String s, String t){
        int sLen=s.length();
        int tLen=t.length();
        int j=0;
        for(int i=0;i<tLen;i++){
            if(s.charAt(j)==t.charAt(i)){
                j++;
                if(j==sLen){
                    return true;
                }
            }
        }
        return false;
    }


    //动态规划
    public static boolean dp(String s, String t){
        int sLen=s.length();
        int tLen=t.length();

        boolean[][] B=new boolean[sLen+1][tLen+1];
        for (int i=0;i<tLen;i++){
            B[0][i]=true;
        }
        for(int i=1;i<sLen+1;i++){
            for(int j=1;j<tLen+1;j++){
                //相等则各退一个字符
                if(s.charAt(i-1) == t.charAt(j-1)){
                    B[i][j]=B[i-1][j-1];
                }else{
                    B[i][j]=B[i][j-1];      //是否是t前1个字符的子序列
                }
            }
        }
        return B[sLen][tLen];
    }
}
