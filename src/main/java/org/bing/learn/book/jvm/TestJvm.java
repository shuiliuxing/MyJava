package org.bing.learn.book.jvm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestJvm {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("开始");
        List<TestJvm> list=new ArrayList<>();
        for(int i=0;i<2000;i++){
            Thread.sleep(50);
            list.add(new TestJvm());
        }
        
    }
}
