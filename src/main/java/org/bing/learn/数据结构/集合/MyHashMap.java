package org.bing.learn.数据结构.集合;

public class MyHashMap<K,V> {
    //节点
    public class Node<K,V>{
        K key;
        V value;
        Node next;

        public Node(){
            this(null,null);
        }

        public Node(K key, V value){
            this.key=key;
            this.value=value;
            this.next=null;
        }
    }

    private Node[] data=new Node[1000];

    public MyHashMap(){
        for(int i=0;i<data.length;i++){
            data[i]=new Node();
        }
    }

    //添加元素
    public void put(K key, V value){
        int index=keyToIndex(key);
        Node node=new Node(key,value);
        //位置
        Node indexNode=data[index];
        while (indexNode.next!=null){
            indexNode=indexNode.next;
        }
        indexNode.next=node;
    }

    //获取元素
    public V get(K key){
        int index=keyToIndex(key);
        Node pre=data[index].next;
        while (pre!=null){
            if(pre.key.equals(key)){
                return (V)pre.value;
            }
            pre=pre.next;
        }
        return null;
    }

    public int keyToIndex(K key){
        //若key是数字类型
        if(key instanceof Integer || key instanceof Double){
            return (Integer)key%1000;
        }
        //若key是字符串
        else if(key instanceof String){
            char c=((String) key).charAt(0);
            int nKey=c;
            return nKey%1000;
        }
        //其它类型。用对象的hashCode哈希码
        return key.hashCode()%1000;
    }

}
