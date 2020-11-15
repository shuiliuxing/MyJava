package org.bing.learn.book.多线程.ThreadLocal;

public class ThreadLocalTest {

    private static ThreadLocal<NumberBean> seqNum=new ThreadLocal<NumberBean>(){
        @Override
        protected NumberBean initialValue() {
            return new NumberBean();
        }
    };

    public NumberBean getNextBum(){
        return seqNum.get();
    }
}
