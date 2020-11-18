package org.bing.learn.华为机试.字符串.简单密码破解HJ21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=2;i<=7;i++){
            map.put(97+(i-2)*3,i);
            map.put(98+(i-2)*3,i);
            map.put(99+(i-2)*3,i);
        }
        map.put(115,7);
        map.put(116,8);
        map.put(117,8);
        map.put(118,8);
        map.put(119,9);
        map.put(120,9);
        map.put(121,9);
        map.put(122,9);
        while (scan.hasNext()){
            String str=scan.next();
            char[] arr=str.toCharArray();
            String res="";
            for(int i=0;i<arr.length;i++){
                //对大写字母的处理
                if(arr[i]>='A' && arr[i]<='Z'){
                    int tmp=arr[i]+32;
                    if(tmp==122){
                        tmp=97;
                    }else{
                        tmp+=1;
                    }
                    res+=(char)tmp;
                }
                //对小写字母的处理
                else if(arr[i]>='a' && arr[i]<='z'){
                    System.out.println(arr[i]+"\t"+(int)arr[i]);
                    res+=map.get((int)arr[i]);
                }
                //其余数字
                else{
                    res+=arr[i];
                }
            }
            System.out.println(res);
        }
    }
}
