package org.bing.learn.book.类加载器;

import org.bing.learn.book.垃圾回收.Test;

public class TestJDKClassLoader {
    public static void main(String[] args){
        System.out.println(String.class.getClassLoader());
        System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader().getClass().getName());
        System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());
        System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
    }
}
