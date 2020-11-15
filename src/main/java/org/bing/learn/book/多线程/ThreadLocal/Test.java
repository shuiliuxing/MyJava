package org.bing.learn.book.多线程.ThreadLocal;

public class Test {

    public static void main(String[] args){
        ThreadLocalTest local=new ThreadLocalTest();
        ThreadBean tb1=new ThreadBean("线程1",local);
        ThreadBean tb2=new ThreadBean("线程2",local);
        tb1.start();
        tb2.start();
    }
}
