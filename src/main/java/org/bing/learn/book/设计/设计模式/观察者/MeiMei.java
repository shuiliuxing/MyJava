package org.bing.learn.book.设计.设计模式.观察者;

import java.util.ArrayList;
import java.util.List;

public class MeiMei {
    List<Person> list=new ArrayList<Person>();

    public MeiMei(){}

    public void addPerson(Person p){
        list.add(p);
    }

    //遍历List，发通知给所有人
    public void notifyPerson(){
        for(Person p:list){
            p.getMessage("大家过来玩游戏噢！");
        }
    }
}
