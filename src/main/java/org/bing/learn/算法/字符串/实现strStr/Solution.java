package org.bing.learn.算法.字符串.实现strStr;

public class Solution {
    public static void main(String[] args){
        String haystack="aaaaa";
        String needle="bba";
        System.out.print(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
