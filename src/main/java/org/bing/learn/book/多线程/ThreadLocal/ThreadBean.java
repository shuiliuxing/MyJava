package org.bing.learn.book.多线程.ThreadLocal;

public class ThreadBean extends Thread{

    private ThreadLocalTest tlt;

    public ThreadBean(String name, ThreadLocalTest tlt){
        super(name);
        this.tlt=tlt;
    }

    @Override
    public void run() {
        while (tlt.getNextBum().getId()<100){
            tlt.getNextBum().setId(tlt.getNextBum().getId()+1);
            System.out.println(this.getName()+"数字："+tlt.getNextBum().getId());
        }
    }

    public void setTlt(ThreadLocalTest tlt){
        this.tlt=tlt;
    }
    public ThreadLocalTest getTlt(){
        return tlt;
    }

}
