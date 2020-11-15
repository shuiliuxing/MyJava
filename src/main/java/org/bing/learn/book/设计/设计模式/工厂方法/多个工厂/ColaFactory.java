package org.bing.learn.book.设计.设计模式.工厂方法.多个工厂;

public class ColaFactory implements Factory{
    @Override
    public Product startProduce() {
        System.out.println("开始生产可乐！");
        return new ColaProduct();
    }
}
