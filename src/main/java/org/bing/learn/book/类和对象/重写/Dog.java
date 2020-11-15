package org.bing.learn.book.类和对象.重写;

public class Dog extends Animal{
    public Dog(){
        System.out.println("狗构造函数");
    }

    static {
        System.out.println("狗静态代码段1");
    }
    static {
        System.out.println("狗静态代码段2");
    }

    {
        System.out.println("狗构造块1");
    }
    {
        System.out.println("狗构造块2");
    }

    @Override
    public void eat(){
        System.out.println("狗吃");
    }
}
