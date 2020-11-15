package org.bing.learn.book.设计.设计模式.工厂方法.多个工厂;

public class SpriteFactory implements Factory{
    @Override
    public Product startProduce() {
        System.out.println("开始生产雪碧！");
        return new SpriteProduct();
    }
}
