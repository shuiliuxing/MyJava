package org.bing.learn.book.序列化;

import com.alibaba.fastjson.JSON;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception{
        //serializeUser();
        //deSerializeUser();
        ser();
    }

    //序列化
    public static void serializeUser() throws FileNotFoundException, IOException, ClassNotFoundException{
        User user=new User();
        user.setName("架构师");
        user.setAge(20);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E://data/java/write/one.log"));
        oos.writeObject(user);
        oos.close();
        System.out.println("添加了transient关键字序列化:"+user.getAge());
    }

    //反序列化
    public static void deSerializeUser() throws IOException, ClassNotFoundException{
        File file=new File("E://data/java/write/one.log");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        User user=(User)ois.readObject();
        System.out.println("添加了transient关键字反序列化："+user.getName());
    }

    public static void ser(){
        User user=new User();
        user.setName("架构师");
        user.setAge(20);
        String jsr=JSON.toJSONString(user);
        System.out.println(jsr);

        int a[]={1,1};
    }

}
