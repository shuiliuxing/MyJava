package org.bing.learn.book.设计.设计模式.装饰者;

public class Test {
    public static void main(String[] args){
        Food food=new Bread(new Vegetable(new Cream(new Food("香肠+"))));
        System.out.println(food.makeFood());
    }
}
