package org.bing.learn.book.设计.设计模式.工厂方法.普通工厂;

public class SmsSender implements Sender {
    @Override
    public void send(){
        System.out.println("发送短信");
    }
}
