package org.bing.learn.book.类和对象.内部类;

class Outer{
    private String str="外部类字符串";

    class Inner{
        private String inStr="内部类字符串";
        public void print(){
            System.out.println(inStr);
        }
    }

    public void fun(){
        Inner in=new Inner();
        in.print();
    }
}

public class Test {
    public static void main(String[] args){
        Outer ot=new Outer();
        ot.fun();
        int a=1;
        double b=5.3e12;
        System.out.println(b);
    }
}
