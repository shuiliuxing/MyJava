package org.bing.learn.华为机试.栈.合并表记录HJ8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        int n=Integer.valueOf(scan.nextLine());
        for(int i=0;i<n;i++){
            String[] arr=scan.nextLine().split(" ");
            Integer key=Integer.valueOf(arr[0]);
            Integer value=Integer.valueOf(arr[1]);
            if(map.containsKey(key)){
                map.put(key,map.get(key)+value);
            }else{
                map.put(key,value);
            }
        }
        for(Integer key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
