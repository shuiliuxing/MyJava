package org.bing.learn.book.设计.设计模式.代理;

public class RealSubject implements Subject{

    @Override
    public void request(){
        System.out.println("访问真实主题！");
    }
}
