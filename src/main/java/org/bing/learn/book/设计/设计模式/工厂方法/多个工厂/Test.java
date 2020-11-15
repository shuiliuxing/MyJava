package org.bing.learn.book.设计.设计模式.工厂方法.多个工厂;

public class Test {
    public static void main(String[] args){
        //生产可乐
        Factory colaFactory=new ColaFactory();
        Product colaProduct=colaFactory.startProduce();
        colaProduct.show();

        //生产雪碧
        Factory spriteFactory=new SpriteFactory();
        Product spriteProduct=spriteFactory.startProduce();
        spriteProduct.show();
    }
}
