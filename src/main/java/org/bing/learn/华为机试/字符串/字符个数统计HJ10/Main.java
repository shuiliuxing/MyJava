package org.bing.learn.华为机试.字符串.字符个数统计HJ10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        char[] arr=scan.next().toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
                num++;
            }
        }
        System.out.println(num);
    }
}
