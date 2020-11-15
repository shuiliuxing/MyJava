package org.bing.learn.数据结构.链表;

public class Test {
    public static void main(String[] args){
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove();
        linkedList.remove();
        for(int i=0;i<linkedList.getSize();i++){
            System.out.println(i+"\t"+linkedList.get(i));
        }

    }
}
