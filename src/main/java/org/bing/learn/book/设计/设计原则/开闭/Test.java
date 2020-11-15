package org.bing.learn.book.设计.设计原则.开闭;

public class Test {
    public static void main(String[] args){
        Driver driver=new Driver("司机");
        driver.eat();
        driver.sleep();
        driver.drive();
        Seller seller=new Seller("售货员");
        seller.eat();
        seller.sleep();
        seller.sell();
    }
}
