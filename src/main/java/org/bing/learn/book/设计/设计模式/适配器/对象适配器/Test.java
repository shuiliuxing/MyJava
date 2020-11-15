package org.bing.learn.book.设计.设计模式.适配器.对象适配器;

public class Test {
    public static void main(String[] args){
        Adapter adapter=new Adapter(new Source());
        adapter.eat();
        adapter.sleep();

    }
}
