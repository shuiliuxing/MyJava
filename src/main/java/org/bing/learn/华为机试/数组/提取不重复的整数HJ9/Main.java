package org.bing.learn.华为机试.数组.提取不重复的整数HJ9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        char[] arr=scanner.next().toCharArray();
        Map<Character, Integer> map=new HashMap<Character, Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
                System.out.print(arr[i]);
            }
        }
    }
}
