package org.bing.learn.book.设计.设计模式.装饰者;

public class Food {
    private String name;

    public Food(){}
    public Food(String name){
        this.name=name;
    }

    public String makeFood(){
        return name;
    }
}
