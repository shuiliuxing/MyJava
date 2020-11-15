package org.bing.learn.book.垃圾回收;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
    public static void main(String[] args){
        String s=new String("Hello");
        ReferenceQueue<String> rq=new ReferenceQueue<>();
        PhantomReference pr=new PhantomReference(s, rq);
        System.out.println(pr.get());
    }
}
