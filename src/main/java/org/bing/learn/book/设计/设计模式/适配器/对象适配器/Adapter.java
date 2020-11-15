package org.bing.learn.book.设计.设计模式.适配器.对象适配器;

public class Adapter implements Target{
    private Source source;

    public Adapter(Source source){
        this.source=source;
    }

    @Override
    public void eat(){
        source.eat();
    }

    @Override
    public void sleep(){
        System.out.println("睡觉");
    }
}
