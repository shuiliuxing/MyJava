package org.bing.learn.book.文件.FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class Test {
    public static void main(String[] args) throws Exception{
        File file=new File("E:\\data\\java\\read\\test.log");
        FileInputStream fis=new FileInputStream(file);
        byte[] bt=new byte[30];
        int len;
        while ((len=fis.read(bt))!=-1){
            System.out.println("长度："+len);
        }
        fis.close();

        Integer a=100;
        a+=1;
        System.out.println(a);
    }
}
