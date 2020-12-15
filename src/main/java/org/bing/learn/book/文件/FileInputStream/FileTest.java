package org.bing.learn.book.文件.FileInputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileTest {
    public static void main(String[] args) throws Exception{
        //读
        FileInputStream fis=new FileInputStream("C:\\Users\\Administrator\\Downloads\\UserBehavior.csv");
        FileChannel fci=fis.getChannel();
        //写
        FileOutputStream fos=new FileOutputStream("D:\\user_behavior.log");
        FileChannel fco=fos.getChannel();
        ByteBuffer bf=ByteBuffer.allocate(4096);
        int count;
        int num=0;
        while ((num<123456) || (count=fci.read(bf))!=-1){
            bf.flip();
            fco.write(bf);
            fco.force(true);
            bf.clear();
            num++;
        }
        fci.close();
        fco.close();
    }
}
