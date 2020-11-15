package org.bing.learn.算法.字符串.最长公共前缀;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        String[] strs={"","b"};
        String s="";
        System.out.println(longestCommonPrefix(strs));
    }

    //技巧--先排序，然后只需比较第1个和第n-1个字符串
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        String ls="";
        String s=strs[0];
        String t=strs[strs.length-1];
        int minLen=s.length()<=t.length()?s.length():t.length();
        if(minLen==0){
            return "";
        }
        for(int i=0;i<minLen;i++){
            if(s.charAt(i)==t.charAt(i)) {
                ls += s.charAt(i);
            }else{
                return ls;
            }
        }
        return ls;
    }
}
