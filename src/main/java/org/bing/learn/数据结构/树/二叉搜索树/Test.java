package org.bing.learn.数据结构.树.二叉搜索树;

public class Test {
    public static void main(String[] args){
        BST<Integer> bst=new BST<>();
        bst.add(63);
        bst.add(90);
        bst.add(70);
        bst.add(55);
        bst.add(67);
        bst.add(42);
        bst.add(98);
        bst.add(83);
        bst.add(10);
        bst.add(45);
        bst.add(58);

        //层次遍历
        System.out.println("层次遍历：");
        bst.leverOrder();
        System.out.println();

        //先序遍历
        System.out.println("先序遍历：");
        bst.preOrder();
        System.out.println();

        //中序遍历
        System.out.println("中序遍历：");
        bst.inOrder();
        System.out.println();

        //后序遍历
        System.out.println("后序遍历：");
        bst.postOrder();
        System.out.println();

        //查找--是否有该元素
        System.out.println("包含45吗？ "+bst.contain(45));

        //最小值
        System.out.println("最小值："+bst.minValue());
        //最大值
        System.out.println("最小值："+bst.maxValue());
        System.out.println();

        //删除值
        System.out.println("删除45前元素节点："+bst.getSize());
        System.out.println("删除45后层次遍历：");
        bst.remove(45);
        bst.leverOrder();
        System.out.println("删除45后元素节点："+bst.getSize());
    }
}
