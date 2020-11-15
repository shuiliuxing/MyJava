package org.bing.learn.book.设计.设计模式.单例;

/**
 * @author mufan
 * 饿汉式
 */
public class HungrySingleton {
    private static final HungrySingleton instance=new HungrySingleton();

    private HungrySingleton(){} //构造函数私有，这样该类就不会被示例化

    public static HungrySingleton getInstance(){
        return instance;
    }
}
