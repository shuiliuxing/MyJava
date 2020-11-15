package org.bing.learn.book.Socket;


import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try{
            Socket socket=new Socket("127.0.0.1",55533);
            socket.getOutputStream().write("1111".getBytes());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
