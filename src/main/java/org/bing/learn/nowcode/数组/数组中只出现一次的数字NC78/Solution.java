package org.bing.learn.nowcode.数组.数组中只出现一次的数字NC78;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args){
        boolean[] arr=new boolean[10];
        System.out.println(arr[0]);
    }

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        num1[0]=Integer.MIN_VALUE;
        num2[0]=Integer.MIN_VALUE;
        int len=array.length;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<len;i++){
            Integer key=array[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        for(Integer key: map.keySet()){
            if(map.get(key)==1){
                if(num1[0]==Integer.MIN_VALUE){
                    num1[0]=key;
                }else{
                    num2[0]=key;
                }
            }
        }
    }
}
