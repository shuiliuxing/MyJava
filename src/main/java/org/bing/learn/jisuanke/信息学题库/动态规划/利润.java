package org.bing.learn.jisuanke.信息学题库.动态规划;

import org.bing.work.基本工具.Tools;

import java.util.Scanner;

public class 利润 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int[] dp=new int[N];
        dp[0]=arr[0];
        int max=dp[0];
        for(int i=1;i<N;i++){
            dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
            if(dp[i]>max){
                max=dp[i];
            }
        }
        System.out.println(max);
    }
}
