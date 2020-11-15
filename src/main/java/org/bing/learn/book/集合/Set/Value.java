package org.bing.learn.book.集合.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Value {
    public static void main(String[] args){
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        Iterator it=set.iterator();
        while (it.hasNext()){
            Integer tmp=(Integer) it.next();
            System.out.println(tmp);
        }
    }

    /*
        HashSet
        元素无序；非同步，可null
     */
    public static void HashSet(){
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
    }

    /*
        TreeSet
        排序；（实现SortedSet）
     */
    public static void TreeSet(){
        Set<Integer> set=new TreeSet<>();
        set.add(8);
        set.add(1);
        set.add(3);
    }

    //遍历
    public static void iterator(){
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        Iterator it=set.iterator();
        while (it.hasNext()){
            Integer tmp=(Integer) it.next();
            System.out.println(tmp);
        }
    }

}
