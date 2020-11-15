package org.bing.learn.book.类和对象.重写;

public class Animal {

    public Animal(){
        System.out.println("动物构造函数");
    }

    static {
        System.out.println("动物静态代码段1");
    }
    static {
        System.out.println("动物静态代码段2");
    }

    {
        System.out.println("动物构造块1");
    }
    {
        System.out.println("动物构造块2");
    }

    public void eat(){
        System.out.println("动物吃");
    }


}
