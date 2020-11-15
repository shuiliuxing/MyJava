package org.bing.learn.数据结构.树.平衡树;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        AVLTree<String,Integer> tree=new AVLTree<>();
        tree.add("b",2);
        tree.add("d",3);
        tree.add("a",1);
        tree.add("f",6);
        tree.add("h",8);
        tree.add("e",5);
        tree.add("g",7);
        tree.add("c",3);
        tree.add("i",9);

        System.out.println("树的高度："+tree.getHeight());
        System.out.println("节点个数："+tree.getSize());

        ArrayList<String> inList=tree.inOrder();
        System.out.println("中序遍历为：");
        for(String str:inList){
            System.out.print(str+"\t");
        }
        System.out.println();

        List<String> levelList=tree.levelOrder();
        System.out.println("层次遍历为：");
        for(String str:levelList){
            System.out.print(str+"\t");
        }
    }
}
