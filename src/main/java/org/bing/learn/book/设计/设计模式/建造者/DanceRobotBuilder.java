package org.bing.learn.book.设计.设计模式.建造者;

public class DanceRobotBuilder implements IBuilderRobot{
    Robot robot;

    public DanceRobotBuilder(){
        robot=new Robot();
    }

    @Override
    public void buildHead() {
        robot.setHead("造头");
    }

    @Override
    public void buildBody() {
        robot.setBody("造身体");
    }

    @Override
    public void buildHand() {
        robot.setHand("造手");
    }

    @Override
    public void buildFoot() {
        robot.setFoot("造脚");
    }

    @Override
    public Robot buildRobot(){
        return robot;
    }
}
