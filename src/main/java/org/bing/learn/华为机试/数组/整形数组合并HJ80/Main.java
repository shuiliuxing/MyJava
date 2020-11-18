package org.bing.learn.华为机试.数组.整形数组合并HJ80;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            Set<Integer> set=new TreeSet<Integer>();
            int n1=scan.nextInt();
            for(int i=0;i<n1;i++){
                set.add(scan.nextInt());
            }
            int n2=scan.nextInt();
            for(int i=0;i<n2;i++){
                set.add(scan.nextInt());
            }
            for(int t:set){
                System.out.print(t);
            }
            System.out.println();
        }
    }
}
