package org.bing.learn.book.设计.设计模式.装饰者;

public class Cream extends Food{
    private Food food;

    public Cream(Food f){
        this.food=f;
    }

    @Override
    public String makeFood(){
        return food.makeFood()+"奶油+";
    }
}
