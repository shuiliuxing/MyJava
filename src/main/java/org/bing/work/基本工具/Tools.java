package org.bing.work.基本工具;

import java.util.List;

public class Tools {

    //打印一维数组
    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    //打印二维数组
    public static void printArr(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    //打印
    public static void printArr(boolean[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    //打印List
    public static void printList(List<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();
    }

}
