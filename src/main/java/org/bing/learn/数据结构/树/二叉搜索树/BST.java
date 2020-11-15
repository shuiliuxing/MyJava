package org.bing.learn.数据结构.树.二叉搜索树;

import org.bing.learn.数据结构.队列.ArrayQueue;
import org.bing.learn.数据结构.队列.Queue;

/*
    二叉搜索树
 */
public class BST<E extends Comparable<E>>{
    //节点
    private class Node{
        public E e;
        public Node left;
        public Node right;

        public Node(E e){
            this.e=e;
            this.left=null;
            this.right=null;
        }
    }

    private Node root;  //根节点
    private int size;   //元素个数

    //树节点个数
    public int getSize(){
        return size;
    }
    //是否为空
    public boolean isEmpty(){
        return size==0;
    }

    /*
        添加元素--node为根的树添加元素e，比大小，递归
        左右字树为空即新建节点赋予
        最终返回二分搜索树的根root
     */
    public Node add(Node node, E e){
        if(node==null){
            size++;
            return new Node(e);
        }
        //小于
        if(e.compareTo(node.e)<0){
            node.left=add(node.left,e);
        }
        //大于
        else if(e.compareTo(node.e)>0){
            node.right=add(node.right,e);
        }
        return node;
    }
    public void add(E e){
        root=add(root,e);
    }

    //层次遍历
    public void leverOrder(){
        if(root==null){
            return;
        }
        Queue<Node> queue=new ArrayQueue<>();
        queue.push(root);
        while (!queue.isEmpty()){
            Node node=queue.pop();
            System.out.println("\t"+node.e);
            if(node.left!=null) {
                queue.push(node.left);
            }
            if(node.right!=null) {
                queue.push(node.right);
            }
        }
    }

    //先序遍历（根左右）
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println("\t"+node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void preOrder(){
        preOrder(root);
    }

    //中序遍历（左根右）
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println("\t"+node.e);
        inOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }

    //后序遍历（左右根）
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println("\t"+node.e);
    }
    public void postOrder(){
        postOrder(root);
    }

    //查找--是否有该元素
    public boolean contain(E e){
        return contain(root,e);
    }
    public boolean contain(Node node, E e){
        if(node==null){
            return false;
        }
        if(e.compareTo(node.e)==0){
            return true;
        }else if(e.compareTo(node.e)<0){
            return contain(node.left,e);
        }else{
            return contain(node.right,e);
        }
    }

    //查找--最小值
    public E minValue(){
        if(size==0){
            throw new IllegalArgumentException("树为空！");
        }
        Node node=minValue(root);
        return node.e;
    }
    public Node minValue(Node node){
        if(node.left==null){
            return node;
        }
        return minValue(node.left);
    }

    //查找--最大值
    public E maxValue(){
        if(size==0){
            throw new IllegalArgumentException("树为空！");
        }
        Node node=maxValue(root);
        return node.e;
    }
    public Node maxValue(Node node){
        if(node.right==null){
            return node;
        }
        return maxValue(node.right);
    }

    //删除最小节点
    public Node removeMin(Node node){
        if(node.left==null){
            Node rightNode=node.right;
            node.right=null;
            size--;
            return rightNode;
        }
        node.left=removeMin(node.left);
        return node;
    }

    //删除节点
    public void remove(E e){
        remove(root,e);
    }
    public Node remove(Node node, E e){
        if(e.compareTo(node.e)<0){
            node.left=remove(node.left,e);
            return node;
        }
        if(e.compareTo(node.e)>0){
            node.right=remove(node.right,e);
            return node;
        }
        //到node.e=e的节点,即待删除节点
        else{
            //左子树为空
            if(node.left==null){
                Node rightNode=node.right;
                node.right=null;
                size--;
                return rightNode;
            }
            //右字树为空
            if (node.right==null){
                Node leftNode=node.left;
                node.left=null;
                size--;
                return leftNode;
            }
            //左右字树都不为空,用最小代替删除的
            Node minNode=minValue(node.right);  //右字树最小
            minNode.right=removeMin(node.right);    //删除右字树最小，并调整指向
            minNode.left=node.left;
            node.left=node.right=null;  //帮助GC
            return minNode;
        }
    }

}


/*
    二叉树的高度：从下往上数，叶子节点高度为1。最终取左右子树高度最大值
    二叉树的深度：从上往下数，根节点深度为1，第2层深度为2，第3层深度为3......第n层深度为n
 */