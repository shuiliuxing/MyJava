package org.bing.learn.数据结构.树.平衡树;

import org.bing.learn.数据结构.树.二叉搜索树.BST;
import org.bing.learn.数据结构.队列.ArrayQueue;
import org.bing.learn.数据结构.队列.Queue;

import java.util.ArrayList;
import java.util.List;

/*
    平衡二叉树
    前提二叉排序树，平很因子<=1
 */
public class AVLTree<K extends Comparable<K>,V> {
    //节点
    private class Node{
        private K key;
        private V value;
        private Node left,right;
        public int height;      //高度

        public Node(K key, V value){
           this.key=key;
           this.value=value;
           left=null;
           right=null;
           height=1;
        }
    }

    private Node root;  //根节点
    private int size;   //节点个数

    public AVLTree(){
        root=null;
        size=0;
    }

    //是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //节点个数
    public int getSize(){
        return size;
    }
    //高度
    public int getHeight(){
        return getHeight(root);
    }
    public int getHeight(Node node){
        if(node==null){
            return 0;
        }
        return node.height;
    }

    //节点的平衡因子
    public int getFactor(Node node){
        if(node==null){
            return 0;
        }
        return getHeight(node.left)-getHeight(node.right);
    }

    //添加
    public void add(K key, V value){
        root=add(root,key,value);
    }
    public Node add(Node node, K key, V value){
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
        node.height=Math.max(getHeight(node.left), getHeight(node.right))+1;//修改当前节点树的高度
        //添加元素后记得平衡
        return balance(node);
    }

    //平衡二叉树
    public Node balance(Node node){
        if(node==null){
            return null;
        }
        //计算平衡因子
        int factor=getFactor(node);
        //当前节点的左子树的左子树中插入了1个节点，则右旋转
        if(factor>1 && getFactor(node.left)>=0){
            return rightRotate(node);
        }
        //当前节点的右子树的右子树插入了1个节点，则左旋转
        if(factor<-1 && getFactor(node.right)>=0){
            return leftRotate(node);
        }
        //当前节点的左子树的右子树插入了1个节点
        if(factor>1 && getFactor(node.left)<0){
            node.left=leftRotate(node.left);    //先左旋
            return rightRotate(node);           //再右旋
        }
        //当前节点的右子树的左子树插入了1个节点
        if(factor<-1 && getFactor(node.right)>0){
            node.right=rightRotate(node.right);  //先右旋
            return leftRotate(node);             //再左旋
        }
        return node;
    }

    //左旋转
    //    P                             R
    //  /  \                          /   \
    // L1   R      向左旋转 (yR)       P     z
    //     / \   - - - - - - - ->   / \   / \
    //   L2  z                     L1 L2 L3 4
    //      / \
    //     L3 T4
    public Node leftRotate(Node node){
        Node R=node.right;
        Node L2=R.left;
        R.left=node;
        node.right=L2;
        //更新旋转后的height
        node.height=Math.max(getHeight(node.left), getHeight(node.right))+1;
        R.height=Math.max(getHeight(R.left), getHeight(R.right))+1;
        return R;
    }

    //右旋转
    // 对节点y进行向右旋转操作，返回旋转后新的根节点x
    //        P                              R
    //       / \                           /   \
    //      R   R4     向右旋转 (y)        z     P
    //     / \       - - - - - - - ->    / \   / \
    //    z   R3                       R1  R2 R3 R4
    //   / \
    // R1   R2
    public Node rightRotate(Node node){
        Node R=node.left;
        Node R3=R.right;
        R.right=node;
        node.left=R3;
        //更改高度
        node.height=Math.max(getHeight(node.left), getHeight(node.right))+1;
        R.height=Math.max(getHeight(R.left),getHeight(R.right))+1;
        return R;
    }

    //中序遍历,得到1个升序队列
    public ArrayList<K> inOrder(){
        ArrayList<K> list=new ArrayList<K>();
        inOrder(root,list);
        return list;
    }
    public void inOrder(Node node, ArrayList<K> list){
        if(node==null){
            return;
        }
        inOrder(node.left,list);
        list.add(node.key);
        inOrder(node.right,list);
    }

    //层次遍历
    public List<K> levelOrder(){
        if(root==null){
            return null;
        }
        List<K> list=new ArrayList<>();
        Queue<Node> queue=new ArrayQueue<>();
        queue.push(root);
        while (!queue.isEmpty()){
            Node node=queue.pop();
            list.add(node.key);
            if(node.left!=null) {
                queue.push(node.left);
            }
            if(node.right!=null) {
                queue.push(node.right);
            }
        }
        return list;
    }

    //最小节点
    public Node minNode(Node node){
        if(node.left==null){
            return node;
        }
        return minNode(node.left);
    }

    //获取节点
    public Node getNode(Node node,K key){
        if(node==null){
            return null;
        }
        if(key.equals(node.key)){
            return node;
        }
        else if(key.compareTo(node.key)<0){
            return getNode(node.left,key);
        }else{
            return getNode(node.right,key);
        }
    }

    //删除
    public V remove(K key){
        Node node=getNode(root,key);
        //若该节点存在
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
        Node retNode;
        //小于
        if(key.compareTo(node.key)<0){
            node.left=remove(node.left,key);
            retNode=node;
        }
        //大于
        else if(key.compareTo(node.key)>0){
            node.right=remove(node.right,key);
            retNode=node;
        }
        //等于
        else {
            //左右子树都不为空
            //用右子树的最小来代替删除节点
            if(node.left!=null && node.right!=null){
                Node minNode=minNode(node.right);   //右子树的最小节点
                //删除最小值，返回删后的子树跟节点
                minNode.right=remove(node.right, node.key);
                minNode.left=node.left;
                node.left=node.right=null;  //帮助GC
                retNode=minNode;
            }
            //左子树或右子树为空
            else{
                retNode=node.left!=null?node.left:node.right;
                size--;
            }
        }
        if(retNode==null){
            return null;
        }
        retNode.height=Math.max(getHeight(retNode.left), getHeight(retNode.right))+1;
        return balance(retNode);
    }




}
