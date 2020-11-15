package org.bing.learn.算法.字符串.字符串中的第一个唯一字符;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args){
        String s="loveleetcode";
        System.out.print(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int len=s.length();
        boolean[] B=new boolean[len];
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(s.charAt(i)==s.charAt(j)){
                    B[i]=true;
                    B[j]=true;
                    break;
                }
            }
        }
        for(int i=0;i<len;i++){
            if(B[i]==false){
                return i;
            }
        }
        return -1;
    }

}
