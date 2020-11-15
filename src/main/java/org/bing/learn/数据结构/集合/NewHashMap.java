package org.bing.learn.数据结构.集合;

import java.util.Objects;
/*
    负载因子0.75综合考虑:
    如果设置过小，HashMap每put少量的数据，都要进行一次扩容，而扩容操作会消耗大量的性能；
    如果设置过大的话，如果设成1，容量还是16，假设现在数组上已经占用的15个，再要put数据进来，计算数组index时，发生hash碰撞的概率将达到15/16，这违背的HashMap减少hash碰撞的原则

    当b的值为2的n次方时，可用
       a % b = a & (b-1)
     位运算更快
 */
public class NewHashMap<K,V> {
    static final int DEFAULT_INITAIL_CAPACITY=1<<4;
    static final float DEFAULT_LOAL_FACTOR=0.75f;

    //节点
    class Node<K,V>{
        int hash;
        K key;
        V value;
        Node<K,V> next;

        public Node(int hash, K key, V value,Node<K,V> next){
            this.hash=hash;
            this.key=key;
            this.value=value;
            this.next=null;
        }
    }

    private Node<K,V>[] table;  //数组
    private int size;       //元素个数
    private int theshold;   //阀值(临界值)

    //添加元素
    public void put(K key,V value){
        int hash= Objects.hashCode(key);    //获取key的哈希值
        int length=DEFAULT_INITAIL_CAPACITY;    //数组厨师成长度
        //数组为空则初始化
        if(table==null){
            table=new Node[length];
            theshold=(int)(DEFAULT_INITAIL_CAPACITY * DEFAULT_LOAL_FACTOR); //新散列表空间使用程度，容量*负载因子
        }
        //根据hashCode取模算出数组下标
        // & 运算代替取模
        int index=hash & (length-1);
        //若原来index位置为空
        if (null==table[index]){
            table[index]=new Node<>(hash,key,value,null);
        }
        //index已经有位置
        else{
            Node<K,V> node=table[index];
            //判断table[index].key是否等于传入的key
            if((node.hash==hash) && (node.key==key || ((key!=null) && node.key.equals(key)))){
                node.value=value;
            }else{
                for(int count=0;;count++){
                    if(null==node.next){
                        node.next=new Node<K,V>(hash,key,value,null);
                        break;
                    }
                    if((node.next.hash==hash) && (node.next.key==key || (key!=null && node.next.key.equals(key)))){
                        node.next.value=value;
                        break;
                    }
                    node=node.next;
                }
            }
        }
        size++;
        //如果size大于阀值，扩容
        if(size>=theshold){
            resize();
        }
    }

    //扩容方法
    public void resize(){
        int newCapacity=table.length <<1;     //新容量=旧*2
        Node<K,V>[] newTable=new Node[newCapacity]; //构建大数组
        theshold=(int)(newCapacity * DEFAULT_LOAL_FACTOR);  //新散列表空间使用程度
        //转移数据
        for(Node<K,V> oldNode:table)
        {
            //节点为空
            if(null==oldNode){
                continue;
            }
            for(int count=0;;count++)
            {
                if(oldNode==null){
                    break;
                }
                Node<K,V> next=oldNode.next;    //链表开始
                int index=oldNode.hash & (newCapacity-1); //新下标（根据hash重新计算）
                oldNode.next=newTable[index];   //
                newTable[index]=oldNode;
                oldNode=next;
            }
        }
        table=newTable;
    }
}
