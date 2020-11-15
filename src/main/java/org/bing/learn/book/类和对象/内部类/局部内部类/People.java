package org.bing.learn.book.类和对象.内部类.局部内部类;

public class People {

}

class Man{
    public Man(){}

    public People GetWoMan(){
        //局部内部类--定义在1个方法或者1个作用域里面的类，访问权限仅限于方法内
        class Woman extends People{
            int age=0;
        }
        return new Woman();
    }

}
