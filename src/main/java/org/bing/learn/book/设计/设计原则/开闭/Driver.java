package org.bing.learn.book.设计.设计原则.开闭;

public class Driver implements Person{
    private String name;
    public Driver(String name){
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println("在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("在睡觉");
    }

    //独有
    public void drive(){
        System.out.println("在开车");
    }


}
