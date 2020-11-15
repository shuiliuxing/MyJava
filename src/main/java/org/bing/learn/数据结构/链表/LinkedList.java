package org.bing.learn.数据结构.链表;

import org.bing.learn.nowcode.链表.反转链表NC78.Solution;

import javax.xml.soap.Node;
import java.util.Stack;

/*
    单链表，头节点不存数据,数据从head->next开始
    head 0 1 2 3 4 5 6
 */
public class LinkedList<E> {
    //节点
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e=e;
            this.next=next;
        }
        public Node(E e){
            this(e,null);
        }
        public Node(){
            this(null,null);
        }
    }

    private Node head;  //首节点
    private int size;   //大小

    public LinkedList(){
        head=new Node();
        size=0;
    }

    /** 元素个数 **/
    public int getSize(){
        return size;
    }

    /** 是否为空 **/
    public boolean isEmpty(){
        return size==0;
    }

    /** 获取元素 **/
    public E get(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("index越界！");
        }
        Node pre=head.next;
        for(int i=0;i<index;i++){
            pre=pre.next;
        }
        return pre.e;
    }

    /** 查找元素 **/
    public boolean contains(E e){
        Node pre=head.next;
        while (pre!=null){
            if(pre.e.equals(e)){
                return true;
            }
            pre=pre.next;
        }
        return false;
    }

    /** 添加元素--指定位置 **/
    public void add(int index, E e){
        if(index<0 || index>size){
            throw new IllegalArgumentException("index越界！");
        }
        Node pre=head;
        for(int i=0;i<index;i++){
            pre=pre.next;   //pre指向index
        }
        Node ixNode=new Node(e,pre.next);
        pre.next=ixNode;
        size++;
    }
    /** 添加元素--尾部 **/
    public void add(E e){
        add(size,e);
    }

    /** 删除元素 index **/
    public E remove(int index){
        if(index<0 || index>size){
            throw new IllegalArgumentException("index 越界！");
        }
        Node pre=head;
        for(int i=0;i<index;i++){
            pre=pre.next;   //pre指向index前1个
        }
        Node tNode=pre.next;
        pre.next=pre.next.next;
        tNode.next=null;    //帮助GC
        size--;
        return tNode.e;
    }

    /** 删除元素 e **/
    public void removeEle(E e){
        Node pre=head;
        while (pre.next!=null){
            if(pre.next.e.equals(e)){
                Node delNode=pre.next;
                pre.next=delNode.next;
                delNode.next=null;
                size--;
                break;
            }
            pre=pre.next;
        }
    }


    /** 删除元素 **/
    public E remove(){
        return remove(size-1);
    }


}
