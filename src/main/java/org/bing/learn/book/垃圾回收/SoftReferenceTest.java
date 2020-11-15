package org.bing.learn.book.垃圾回收;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class SoftReferenceTest {

    public static void main(String[] args){
        ReferenceQueue<String> rq=new ReferenceQueue<>();
        String s=new String("Hello");
        SoftReference<String> sr=new SoftReference<>(s, rq);

        s=null;
        System.gc();
        System.out.println(sr.get());   //Hello

        Reference<? extends String> r=rq.poll();
        System.out.println(r);      //null
    }
}
