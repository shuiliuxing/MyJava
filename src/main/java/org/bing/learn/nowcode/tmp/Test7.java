package org.bing.learn.nowcode.tmp;

public class Test7 {
    public static void main(String[] args){
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");
        String s4="ab"+"c";
        String s5="ab"+new String("c");
        String s6=s3;

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s3==s5);
        System.out.println(s3==s6);
    }
}
