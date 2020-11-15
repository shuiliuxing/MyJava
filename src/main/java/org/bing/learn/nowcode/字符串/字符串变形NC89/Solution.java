package org.bing.learn.nowcode.字符串.字符串变形NC89;

public class Solution {
    public static void main(String[] args){
        String s="This is a sample";
        int n=16;
        System.out.println(trans(s,n));
    }

    public static String trans(String s, int n){
        String res="";
        String[] arr=s.split(" ",-1);
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr[i].length();j++){
                char c=arr[i].charAt(j);
                if(c>='A' && c<='Z'){
                    c=(char) (c+32);
                }else{
                    c=(char) (c-32);
                }
                res+=c;
            }
            if(i!=0){
                res+=" ";
            }
        }
        return res;
    }
}
