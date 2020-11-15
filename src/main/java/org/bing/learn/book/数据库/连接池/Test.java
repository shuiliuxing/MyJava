package org.bing.learn.book.数据库.连接池;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args){
        //创建3个Connection连接
        ConnectionPool pool=new ConnectionPool(3);

        //开启100线程，共享连接池List<Connection>
        for(int i=0;i<100;i++){
            new WorkThread("工作线程 "+i, pool).start();
        }
    }
}

class WorkThread extends Thread{
    private ConnectionPool cnPool;

    public WorkThread(String name, ConnectionPool cnPool){
        super(name);
        this.cnPool=cnPool;
    }

    @Override
    public void run(){
        //获取list里面的
        Connection c=cnPool.getConnection();
        try{
            Statement st=c.createStatement();
            Thread.sleep(1000);
            st.execute("select *  from sys_role");
        }catch (SQLException | InterruptedException e){
            e.printStackTrace();
        }
        cnPool.returnConnection(c);
    }
}
