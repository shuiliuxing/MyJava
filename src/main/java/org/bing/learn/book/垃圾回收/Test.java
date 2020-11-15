package org.bing.learn.book.垃圾回收;

/**
 * @author mufan
 */
public class Test {
    public Test(String name){}
    public static final Test a=new Test("");

    public static void main(String[] args){
        Test t=new Test("Hello");
        t=null;
    }
}
