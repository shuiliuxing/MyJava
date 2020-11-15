package org.bing.learn.book.设计.设计模式.观察者;

public class Test {
    public static void main(String[] args){
        MeiMei meiMei=new MeiMei();

        XiaoMing xiaoMing=new XiaoMing();
        LiLei liLei=new LiLei();

        meiMei.addPerson(xiaoMing);
        meiMei.addPerson(liLei);

        meiMei.notifyPerson();

    }
}
