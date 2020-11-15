package org.bing.learn.book.类和对象.内部类.成员内部类;

public class Circle {
    private double radius=0;
    public static int count=1;

    public Circle(double radius){
        this.radius=radius;
    }

    //成员内部类
    class Draw{
        public void drawShape(){
            System.out.println(radius);     //外部类的private成员
            System.out.println(count);      //外部类的static成员
        }
    }

}
