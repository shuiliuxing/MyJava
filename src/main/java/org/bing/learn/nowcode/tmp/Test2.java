package org.bing.learn.nowcode.tmp;

public class Test2 {
    public static void main(String[] args) throws InterruptedException{
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                System.out.println("2");
            }
        });
        t.start();
        t.join();
        System.out.println("1");
    }
}
