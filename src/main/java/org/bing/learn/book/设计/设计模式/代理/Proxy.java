package org.bing.learn.book.设计.设计模式.代理;

public class Proxy implements Subject{
    private RealSubject realSubject;

    @Override
    public void request(){
        if(realSubject==null){
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("预处理......");
    }

    public void postRequest(){
        System.out.println("处理后......");
    }
}
