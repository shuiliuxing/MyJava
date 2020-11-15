package org.bing.learn.nowcode.字符串.旋转字符串NC114;

public class Solution {
    public static void main(String[] args){
        String A="youzan";
        String B="zyouan";
        System.out.println(solve(A,B));
    }

    public static boolean solve (String A, String B) {
        int n=A.length();
        for(int i=0;i<n-1;i++){
            String s=A.substring(i,n)+A.substring(0,i);
            if(s.equals(B)){
                return true;
            }
        }
        return false;
    }
}
