package org.bing.learn.book.多线程.Volatile;

public class Test {
    public static volatile int race=0;

    public static void increase(){
        race++;
    }

    public static void main(String[] args){
        Thread[] t=new Thread[20];
        for(int i=0;i<20;i++){
            t[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    increase();
                }
            });
            t[i].start();
        }
        System.out.println(race);
    }
}
