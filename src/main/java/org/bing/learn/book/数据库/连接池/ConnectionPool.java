package org.bing.learn.book.数据库.连接池;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    List<Connection> list=new ArrayList<Connection>();

    public ConnectionPool(int size){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            for(int i=0;i<3;i++){
                Connection conn= DriverManager.getConnection("jdbc:mysql://122.152.200.71:3301/ry?characterEncoding=utf8","root","hGdtoA2%B");
                list.add(conn);
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //从list获取连接
    public synchronized Connection getConnection(){
        while (list.isEmpty()){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        Connection topConn=list.remove(0);
        return topConn;
    }

    public synchronized void returnConnection(Connection c){
        list.add(c);
        this.notifyAll();
    }

}
