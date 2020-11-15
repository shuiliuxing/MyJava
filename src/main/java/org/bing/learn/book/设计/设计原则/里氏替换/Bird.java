package org.bing.learn.book.设计.设计原则.里氏替换;

public class Bird {
    double flySpeed;

    public void setFlySpeed(double speed){
        this.flySpeed=speed;
    }

    public double getCostTime(double distince){
        return distince/flySpeed;
    }

}
