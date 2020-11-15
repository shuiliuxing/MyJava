package org.bing.learn.book.设计.设计模式.观察者;

public class LiLei implements Person{
    @Override
    public void getMessage(String str) {
        System.out.println("李雷接到美美的通知："+str);
    }
}
