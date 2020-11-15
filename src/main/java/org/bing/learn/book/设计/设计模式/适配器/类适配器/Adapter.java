package org.bing.learn.book.设计.设计模式.适配器.类适配器;

public class Adapter extends Source implements Target {
    @Override
    public void sleep(){
        System.out.println("睡觉");
    }
}
