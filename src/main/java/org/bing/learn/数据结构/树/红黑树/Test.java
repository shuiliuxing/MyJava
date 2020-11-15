package org.bing.learn.数据结构.树.红黑树;

public class Test {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        String[] str={"a","b","c","d","e","f","g","h","i","j"};
        RBTree<Integer,String> rbTree=new RBTree<>();
        for(int i=0;i<arr.length;i++){
            rbTree.add(arr[i],str[i]);
        }
        rbTree.printTree();

    }
}
