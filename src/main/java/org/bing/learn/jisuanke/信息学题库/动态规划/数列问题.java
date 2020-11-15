package org.bing.learn.jisuanke.信息学题库.动态规划;

import java.math.BigInteger;
import java.util.Scanner;

public class 数列问题 {
    public static BigInteger[] arr=new BigInteger[61];

    public static void main(String[] args){
        dp1();
    }

    //递归
    public static void main1(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=new BigInteger("0");
        }
        System.out.println(dp(n));
    }
    public static BigInteger dp(int n){
        if(arr[n].compareTo(new BigInteger("0"))!=0){
            return arr[n];
        }
        if(n==1){
            return new BigInteger("3");
        }else if(n==2){
            return new BigInteger("4");
        }else if(n==3){
            return new BigInteger("5");
        }else{
            BigInteger tmp=dp(n-1).add(dp(n-2)).add(dp(n-3));
            arr[n]=tmp;
            return tmp;
        }
    }

    //动态规划
    public static void dp1(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=new BigInteger("0");
        }
        arr[1]=new BigInteger("3");
        arr[2]=new BigInteger("4");
        arr[3]=new BigInteger("5");
        for(int i=4;i<=60;i++){
            arr[i]=arr[i-1].add(arr[i-2]).add(arr[i-3]);
        }
        System.out.println(arr[n]);
    }
}
