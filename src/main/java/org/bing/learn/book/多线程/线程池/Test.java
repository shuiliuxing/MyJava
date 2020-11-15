package org.bing.learn.book.多线程.线程池;

public class Test {
    public static void main(String[] args){
        ThreadPool pool=new ThreadPool();
        for(int i=0;i<5;i++)
        {
            Runnable runnable=new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行任务！");
                }
            };
            pool.add(runnable);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
