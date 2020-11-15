package org.bing.learn.book.Socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InputMismatchException;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(55533);    //开放监听端口，等待连接
        //等到一个宿舍

        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        byte[] bt=new byte[4];
        int len;
        while ((len=is.read(bt))!=-1){
            System.out.println(len);
        }
    }
}
