package org.bing.learn.book.设计.设计模式.建造者;

public class Test {
    public static void main(String[] args){
        Director dr=new Director();
        Robot rb=dr.createRobotByDirector(new DanceRobotBuilder());

        System.out.println(rb.getBody());
    }
}
