package org.bing.learn.book.多线程.线程池;

import java.util.LinkedList;
/*
    设计思路：
       1.准备一个任务容器
       2.一次性启动10个消费线程
       3.刚开始任务容器是空的，所以线程都wait在上面
       4.直到一个外部线程往这个任务容器扔了一个“任务”，就会有一个消费者线程被唤醒notify
       5.这个消费者线程取出任务，并且执行这个任务，执行完毕后，继续等待下一次任务的到来
       6.如果短时间内有较多的任务加入，那么就会有多个线程被唤醒，去执行这些任务
 */
public class ThreadPool {
    int threadSize;   //线程池大小
    LinkedList<Runnable> list=new LinkedList<Runnable>(); //任务容器

    public ThreadPool(){
        threadSize=10;
        //启动10个任务消费者线程
        synchronized (list){
            for(int i=0;i<threadSize;i++){
                new TaskConsumeThread("任务消费线程"+i).start();
            }
        }
    }

    public void add(Runnable r){
        synchronized (list){
            list.add(r);
            //唤醒等待的任务消费线程
            list.notifyAll();
        }
    }

    //成员内部类
    class TaskConsumeThread extends Thread{
        Runnable runnable;
        public TaskConsumeThread(String name){
            super(name);
        }

        @Override
        public void run()
        {
            System.out.println("启动："+this.getName());
            while (true)
            {
                synchronized (list)
                {
                    //list为空（线程集合为空），等待
                    while (list.isEmpty()){
                        try{
                            list.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    runnable=list.removeLast();
                    //允许添加任务的list可以继续添加任务Runnable
                    list.notifyAll();
                }
                System.out.println(this.getName()+" 获取任务，并执行");
                runnable.run();
            }

        }

    }
}
