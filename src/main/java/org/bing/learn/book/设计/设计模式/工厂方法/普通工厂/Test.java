package org.bing.learn.book.设计.设计模式.工厂方法.普通工厂;

public class Test {
    public static void main(String[] args){
        Sender s1=new MailSender();     //发送邮件
        s1.send();
        Sender s2=new SmsSender();      //发送短信
        s2.send();
    }
}
