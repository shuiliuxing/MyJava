package org.bing.learn.数据结构.集合;

import org.bing.learn.数据结构.链表.LinkedList;

public class LinkedListMap<K,V> implements Map<K,V> {
    //节点
    private class Node{
        public K key;
        private V value;
        public Node next;

        public Node(K key, V value, Node next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
        public Node(K key, V value){
            this(key,value,null);
        }
        public Node(){
            this(null,null,null);
        }
    }

    private Node head;
    private int size;

    public LinkedListMap(){
        head=new Node();
        size=0;
    }

    @Override
    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public int getSize(){
        return size;
    }

    /** 是否包含key **/
    @Override
    public boolean contains(K key){
        Node pre=head.next;
        while(pre!=null){
            if(pre.key.equals(key)){
                return true;
            }
            pre=pre.next;
        }
        return false;
    }

    @Override
    public void put(K key, V value){
        Node pre=head;
        //pre指向相同节点的前1个
        while (pre.next!=null){
            //相同key
            if(pre.next.key.equals(key)){
                pre.next.value=value;
                return;
            }
            pre=pre.next;
        }
        pre.next=new Node(key,value);
        size++;
    }

    @Override
    public void set(K key, V value){
        Node pre=head.next;
        while (pre!=null){
            if(pre.key.equals(key)){
                pre.value=value;
            }
            pre=pre.next;
        }
    }

    @Override
    public V get(K key){
        Node pre=head.next;
        while (pre!=null){
            if(pre.key.equals(key)){
                return pre.value;
            }
            pre=pre.next;
        }
        return null;
    }

    @Override
    public V remove(K key){
        Node pre=head;
        while (pre.next!=null){
            if(pre.next.key.equals(key)){
                break;
            }
            pre=pre.next;
        }
        if(pre.next!=null){
            Node delNode=pre.next;
            pre.next=delNode.next;
            delNode.next=null;  //帮助GC
            size--;
            return delNode.value;
        }
        return null;
    }

}
