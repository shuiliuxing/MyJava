package org.bing.learn.book.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Apple {
    private int price;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) throws Exception{
        Class clz=Class.forName("org.bing.learn.book.反射.Apple");
        Constructor cst=clz.getConstructor();   //构造函数
        Object obj=cst.newInstance();

        //方法
        Method setMd=clz.getMethod("setPrice", int.class); //方法
        setMd.invoke(obj, 24);
        Method getMd=clz.getMethod("getPrice");
        System.out.println("苹果价格："+getMd.invoke(obj));

        //属性
        Field[] fds=clz.getDeclaredFields();
        for(Field field:fds){
            System.out.println("属性："+field.getName());
        }
    }
}
