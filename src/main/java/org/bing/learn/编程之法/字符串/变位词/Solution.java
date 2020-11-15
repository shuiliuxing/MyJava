package org.bing.learn.编程之法.字符串.变位词;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        String a="abc";
        String b="acb";
        System.out.println(changePosition(a,b));
    }


    //排序后解决
    public static boolean changePosition(String a, String b){
        char[] ach=a.toCharArray();
        char[] bch=b.toCharArray();
        Arrays.sort(ach);
        Arrays.sort(bch);
        return String.valueOf(ach).equals(String.valueOf(bch));
    }
}
