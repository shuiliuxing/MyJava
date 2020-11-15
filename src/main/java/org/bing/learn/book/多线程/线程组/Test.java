package org.bing.learn.book.多线程.线程组;

public class Test {
    public static void main(String[] args){
        Thread t=Thread.currentThread();
        ThreadGroup tg=t.getThreadGroup();
        for(;tg!=null;tg=tg.getParent()){
            int n=tg.activeCount();
            System.out.println("线程组"+tg.getName()+" 包含 "+n+" 个线程");
            Thread[] arr=new Thread[n];
            int m=tg.enumerate(arr);
            for(int i=0;i<m;i++){
                System.out.println("\t"+arr[i].getName());
            }
        }
    }
}
