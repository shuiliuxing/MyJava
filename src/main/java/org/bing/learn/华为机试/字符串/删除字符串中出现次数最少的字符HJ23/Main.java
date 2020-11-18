package org.bing.learn.华为机试.字符串.删除字符串中出现次数最少的字符HJ23;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        while (scan.hasNext()){
            String str=scan.next();
            char[] arr=str.toCharArray();
            Map<Character,Integer> map=new HashMap<Character,Integer>();
            for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }else{
                    map.put(arr[i],1);
                }
                if(map.get(arr[i])<min){
                    min=map.get(arr[i]);
                }
            }
            for(char c:map.keySet()){
                if(map.get(c)==min){
                    str=str.replaceAll(String.valueOf(c),"");
                }
            }
            System.out.println(str);
        }
    }
}
