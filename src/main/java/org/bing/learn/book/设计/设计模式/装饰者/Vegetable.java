package org.bing.learn.book.设计.设计模式.装饰者;

public class Vegetable extends Food{
    private Food food;

    public Vegetable(Food f){
        this.food=f;
    }

    @Override
    public String makeFood(){
        return food.makeFood()+"蔬菜+";
    }
}
