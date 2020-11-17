package org.bing.learn.华为机试.数组.明明的随机数HJ3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt())        //注意注意
        {
            int N=scanner.nextInt();
            int[] arr=new int[N];
            Map<Integer,Integer> map=new HashMap<Integer, Integer>();
            int index=0;
            for(int i=0;i<N;i++){
                int tmp=scanner.nextInt();
                if(!map.containsKey(tmp)){
                    map.put(tmp,1);
                    arr[index]=tmp;
                    index++;
                }
            }
            int[] brr=new int[index];
            for(int i=0;i<index;i++){
                brr[i]=arr[i];
            }
            Arrays.sort(brr);
            for(int i=0;i<brr.length;i++){
                System.out.println(brr[i]);
            }
        }
    }
}
