package org.bing.learn.book.类和对象.内部类.静态内部类;

public class Test {

    public static void main(String[] args){
        Outter.Inner in=new Outter.Inner();
    }
}

class Outter{
    int a=10;
    static int b=5;

    public Outter(){}

    //静态内部类
    static class Inner{
        public Inner(){

        }
    }
}
