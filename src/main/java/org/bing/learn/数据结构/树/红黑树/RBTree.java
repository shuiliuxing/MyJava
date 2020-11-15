package org.bing.learn.数据结构.树.红黑树;

import org.bing.learn.数据结构.队列.ArrayQueue;
import org.bing.learn.数据结构.队列.Queue;

public class RBTree<K extends Comparable<K>,V> {
    private static final boolean RED=true;
    private static final boolean BLACK=false;

    //节点
    public class Node{
        public K key;
        public V value;
        public Node left,right;
        public boolean color;

        public Node(K key, V value){
            this.key=key;
            this.value=value;
            this.left=null;
            this.right=null;
            this.color=RED;
        }
    }

    private Node root;  //根节点
    private int size;   //节点个数

    public RBTree(){
        root=null;
        size=0;
    }

    //节点个数
    public int getSize(){
        return size;
    }
    //是否为空
    public boolean isEmpty(){
        return size==0;
    }

    //判断节点颜色
    public boolean isRed(Node node){
        if(node==null){
            return BLACK;
        }
        return node.color;
    }

    //获取节点
    public Node getNode(Node node, K key){
        if(node==null){
            return null;
        }
        if(key.compareTo(node.key)==0){
            return node;
        }else if(key.compareTo(node.key)<0){
            return getNode(node.left,key);
        }else{
            return getNode(node.right,key);
        }
    }

    //最小节点
    public Node getMinNode(Node node){
        if(node.left==null){
            return node;
        }
        return getMinNode(node.left);
    }

    //查找
    public V get(K key){
        Node node=getNode(root,key);
        if(node==null){
            return null;
        }
        return node.value;
    }

    //颜色翻转
    public void flipColor(Node node){
        node.color=RED;
        node.left.color=BLACK;
        node.right.color=BLACK;
    }

    //左旋转
    //   node                     R
    //  /   \     左旋转         /   \
    // T1   R   --------->   node   T3
    //     / \              /   \
    //    L2 T3            T1   T2
    public Node leftRotate(Node node){
        Node R=node.right;
        Node T2=R.left;
        R.left=node;
        node.right=T2;
        R.color=node.color; //旋转后的颜色跟原根节点颜色一致
        //颜色
        node.color=RED;
        return R;
    }

    //右旋转
    //     node                   L
    //    /   \     右旋转       /  \
    //   L    T2   ------->   y   node
    //  / \                       /  \
    // y  T1                     T1  T2
    public Node rightRotate(Node node){
        Node L=node.left;
        Node T1=L.right;
        L.right=node;
        node.left=T1;
        //颜色
        L.color=node.color;
        node.color=RED;
        return L;
    }

    //添加
    public void add(K key,V value){
        root=add(root,key,value);
        root.color=BLACK;   //最终根节点为黑色
    }
    public Node add(Node node,K key, V value){
        if(node==null){
            size++;
            return new Node(key,value);
        }
        if(key.compareTo(node.key)<0){
            node.left=add(node.left,key,value);
        }else if(key.compareTo(node.key)>0){
            node.right=add(node.right,key,value);
        }else{
            node.value=value;
        }
        //调整平衡
        //(左黑右红)
        if(!isRed(node.left) && isRed(node.right)){
            node=leftRotate(node);
        }
        //(左红、左左红)
        if(isRed(node.left) && isRed(node.left.left)){
            node=rightRotate(node);
        }
        //左红右红
        if(isRed(node.left) && isRed(node.right)){
            flipColor(node);
        }
        return node;
    }

    //删除最小节点（返回删除后新子树的根节点）
    public Node removeMinNode(Node node){
        if(node.left==null){
            Node rightNode=node.right;
            node.right=null;
            size--;
            return rightNode;
        }
        node.left=removeMinNode(node.left);
        return node;
    }
    public V remove(K key){
        Node node=getNode(root,key);
        if(node!=null){
            root=remove(root,key);
            return node.value;
        }
        return null;
    }
    public Node remove(Node node, K key){
        if(node==null){
            return null;
        }
        if(key.compareTo(node.key)<0){
            return remove(node.left,key);
        }else if(key.compareTo(node.key)>0){
            return remove(node.right,key);
        }else{
            //左子树为空
            if(node.left==null){
                Node delNode=node.right;
                node.right=null;
                size--;
                return delNode;
            }
            //右子树为空
            if(node.right==null){
                Node delNode=node.left;
                node.left=null;
                size--;
                return delNode;
            }
            //左、右子树都不为空
            Node minNode=getMinNode(node.right);      //获取最小节点
            minNode.right=removeMinNode(node.right);  //删除最小节点，仍返回node.right子根节点
            minNode.left=node.left;     //最小节点的左节点 是 删除节点的左节点
            node.left=node.right=null;  //帮助GC
            return minNode;
        }
    }

    //打印树--层次遍历
    public void printTree(){
        if(root==null){
            System.out.println("空树！");
            return;
        }
        Queue<Node> queue=new ArrayQueue<>();
        queue.push(root);
        while (!queue.isEmpty()){
            Node node=queue.pop();
            System.out.println("节点："+node.key+"，"+node.value+"，"+node.color);
            if(node.left!=null){
                queue.push(node.left);
            }
            if(node.right!=null){
                queue.push(node.right);
            }
        }
    }

}
