package org.bing.learn.nowcode.字符串.字符串的排列NC121;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args){
        String str="123";
        System.out.println(Permutation(str));
    }

    static Set<String> set=new TreeSet<>();

    public static ArrayList<String> Permutation(String str) {
        char[] arr=str.toCharArray();
        int from=0;
        int to=str.length()-1;
        add(arr,from,to);
        return new ArrayList<>(set);
    }

    public static void add(char[] arr, int from, int to){
        if(from==to){
            String sum="";
            for(int i=0;i<=to;i++){
                sum+=String.valueOf(arr[i]);
            }
            set.add(sum);
        }else{
            for(int j=from;j<=to;j++){
                swap(arr,j,from);
                add(arr,from+1,to);
                swap(arr,j,from);
            }
        }
    }

    public static void swap(char[] arr,int a,int b){
        char c=arr[a];
        arr[a]=arr[b];
        arr[b]=c;
    }
}
