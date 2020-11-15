package org.bing.learn.book.设计.设计模式.装饰者;

public class Bread extends Food {
    private Food food;

    public Bread(Food f){
        this.food=f;
    }

    @Override
    public String makeFood(){
        return food.makeFood()+"面包";
    }
}
