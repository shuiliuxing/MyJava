package org.bing.learn.book.设计.设计模式.单例;

/**
 * @author mufan
 * 懒汉式
 */
public class LazySingleton {

    private static volatile LazySingleton instance=null;     //保证instance在所有线程中同步

    private LazySingleton(){}   //构造函数私有，这样该类就不会被示例化

    public static synchronized LazySingleton getInstance(){ //方法前加同步
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}
