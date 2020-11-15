package org.bing.learn.nowcode.字符串.大数加法NC1;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args){
        String s="1";
        String t="99";
        System.out.println(solve(s,t));
    }

    public static String solve (String s, String t) {
        BigInteger a=new BigInteger(s);
        BigInteger b=new BigInteger(t);
        return a.add(b).toString();
    }
}
