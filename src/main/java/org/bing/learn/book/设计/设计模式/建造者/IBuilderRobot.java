package org.bing.learn.book.设计.设计模式.建造者;

public interface IBuilderRobot {
    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();

    public Robot buildRobot();
}
