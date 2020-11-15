package org.bing.learn.book.设计.设计原则.里氏替换;

public class Animal {
    double runSpeed;

    public void setRunSpeed(double runSpeed){
        this.runSpeed=runSpeed;
    }

    public double getCostTime(double distince){
        return distince/runSpeed;
    }
}
