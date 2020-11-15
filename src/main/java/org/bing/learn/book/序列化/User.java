package org.bing.learn.book.序列化;

import java.io.Serializable;

/**
 * @author mufan
 */
public class User implements Serializable {
    private static final long serialVersionUID = -3909631378076523237L;

    private String name;

    private transient int age;

    public User(){

    }
    public User(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
