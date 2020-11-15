package org.bing.learn.book.垃圾回收;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    public static void main(String[] args){
        String str=new String("Hello");
        WeakReference<String> wr=new WeakReference<>(str);
        str=null;
        System.gc();
        System.out.println(wr.get());
    }
}
