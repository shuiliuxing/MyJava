package org.bing.learn.华为机试.字符串.找出字符串中第一个只出现一次的字符HJ59;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            char[] arr = scan.nextLine().toCharArray();
            Map<Character, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }
            int num=0;
            for (char c : map.keySet()) {
                if(map.get(c)==1){
                    System.out.println(c);
                    break;
                }
                num++;
            }
            if(num>=map.size()){
                System.out.println(-1);
            }
        }
    }
}
