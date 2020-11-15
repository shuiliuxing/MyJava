package org.bing.learn.算法.字符串.反转字符串;

public class Solution {
    public static void main(String[] args){
        char[] s={'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char tmp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=tmp;
        }
    }
}
