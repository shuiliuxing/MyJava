package org.bing.learn.nowcode.tmp;

public class Test3 {
    public static void main(String[] args){
        int i=-5;
//        i=++(i++);
//        Object object=new Object();
//        Object false=new Object();
        String s = "tommy";
        Object o = new String("abc");
        sayHello(o); //语句1
        sayHello(s); //语句2
    }
    public static void sayHello(String to) {
        System.out.println(String.format("Hello, %s", to));
    }
    public static void sayHello(Object to) {
        System.out.println(String.format("Welcome, %s", to));
    }
}
