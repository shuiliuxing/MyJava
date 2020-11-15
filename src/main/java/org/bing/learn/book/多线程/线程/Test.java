package org.bing.learn.book.多线程.线程;

public class Test implements Runnable{
    public static int race=0;

    public static synchronized void increase(){
        race++;
    }

    @Override
    public void run(){
        for(int i=0;i<100;i++){
            increase();
        }
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
