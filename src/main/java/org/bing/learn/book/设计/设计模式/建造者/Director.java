package org.bing.learn.book.设计.设计模式.建造者;

public class Director {
    public Robot createRobotByDirector(IBuilderRobot ibr){
        ibr.buildHead();
        ibr.buildBody();
        ibr.buildHand();
        ibr.buildFoot();
        return ibr.buildRobot();
    }
}
