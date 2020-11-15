package org.bing.learn.book.设计.设计原则.里氏替换;

public class Test {
    public static void main(String[] args){
        Bird swallow=new Swallow();
        swallow.setFlySpeed(120);
        System.out.println("燕子飞行耗时："+swallow.getCostTime(48000));

        Animal kiwi=new Kiwi();
        kiwi.setRunSpeed(16);
        System.out.println("几维鸟飞行耗时："+kiwi.getCostTime(48000));
    }
}
