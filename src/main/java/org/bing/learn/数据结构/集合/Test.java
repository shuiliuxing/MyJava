package org.bing.learn.数据结构.集合;

import org.bing.learn.book.序列化.User;

public class Test {
    public static void main(String[] args){
        MyHashMapTest();
    }

    //LinkedHashMap
    public static void LinkedHashMapTest(){
        LinkedListMap<String,Integer> map=new LinkedListMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("a",11);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));
        System.out.println(map.get("d"));
        System.out.println(map.get("e"));
        System.out.println(map.get("f"));

        System.out.println();
        System.out.println(map.contains("a"));
        System.out.println(map.contains("f"));
        System.out.println();

        System.out.println(map.remove("a"));
        System.out.println("删除a后：");
        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));
        System.out.println(map.get("d"));
        System.out.println(map.get("e"));
        System.out.println(map.get("f"));
    }

    //MyHashMap
    public static void MyHashMapTest(){
        MyHashMap<String,User> map=new MyHashMap<>();
        map.put("a",new User("张三",10));
        map.put("b",new User("李四",11));
        map.put("c",new User("王五",12));
        map.put("d",new User("赵六",13));
        map.put("e",new User("马七",14));
        map.put("f",new User("牛八",15));

        System.out.println();
        User user1=(User)map.get("a");
        System.out.println(user1.getName());
        User user2=(User)map.get("f");
        System.out.println(user2.getName());
    }
}
