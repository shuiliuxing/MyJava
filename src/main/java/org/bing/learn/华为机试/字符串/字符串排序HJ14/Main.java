package org.bing.learn.华为机试.字符串.字符串排序HJ14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.next();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
