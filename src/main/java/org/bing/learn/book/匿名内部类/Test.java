package org.bing.learn.book.匿名内部类;


interface Product{
    public double getAge();
    public String getName();
}
public class Test {

    public void print(Product p){
       System.out.println(p.getName()+","+p.getAge());
    }

    public static void main(String[] args){
        Test t=new Test();
        t.print(new Product() {
            @Override
            public double getAge() {
                return 20;
            }

            @Override
            public String getName() {
                return "Kangkang";
            }
        });
    }

}
