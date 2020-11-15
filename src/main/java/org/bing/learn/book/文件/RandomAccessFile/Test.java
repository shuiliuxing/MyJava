package org.bing.learn.book.文件.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args){
        try {
            RandomAccessFile raf = new RandomAccessFile("D:\\Software\\Fish\\kpdf\\one.txt", "rw");

            System.out.println("初始指针："+raf.getFilePointer());
            raf.seek(20);   //移动指针，从10开始读取
            byte[] bt=new byte[1024];
            int hasRead=0;
            while ((hasRead=raf.read(bt))>0){
                System.out.println(new String(bt,0,hasRead));
            }
            raf.seek(raf.length()); //移动指针到末尾
            raf.write("新添加的内容".getBytes());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
