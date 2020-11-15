package org.bing.learn.编程之法.字符串.单词翻转;

public class Solution {
    public static void main(String[] args){
        String str="I am a student.";
        System.out.println(rotate(str));
    }

    public static String rotate(String str){
       String[] arr=str.split(" ",-1);
       int n=arr.length;
       String res="";
       for(int i=n-1;i>=0;i--){
           if(i==0){
               res+=arr[i];
           }else{
               res+=arr[i]+" ";
           }
       }
       return res;
    }
}
