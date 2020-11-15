package org.bing.learn.jisuanke.信息学题库.动态规划;

import org.bing.work.基本工具.Tools;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class 糖果 {

    public static void main(String[] args) {
        solution1();
    }

    //动态规划
    public static void solution1(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] s = new int[N+1];
        for(int m=1;m<=N;m++) {
            s[m] = scanner.nextInt();
        }

        //前i个数和余数为j（%K）的最优值
        int[][] dp=new int[N+1][K+1];
        //没有数时，不存在
        for(int j=1; j<K; j++){
            dp[0][j]=Integer.MIN_VALUE;
        }
        //遍历前i个数
        for(int i=1;i<=N;i++){
            //遍历余数 0 ~ K-1
            for(int j=0;j<K;j++){
                //前i个数余数为j = （第i个数不放）前i-1个数余数为j   （放第i个数）前i-1个数余数为
                int tmp=(j-s[i]%K +K)%K;    //加K防止j-a[i]%k<0
                dp[i][j]=Math.max(dp[i-1][ j], dp[i-1][tmp]+s[i]);
            }
        }
        System.out.println(dp[N][0]);
    }

    //效率低--未通过
    public static void solution2(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] s = new int[N];
        int max=0;
        int len,sum;
        for(int m=0;m<N;m++) {
            s[m] = scanner.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(s[0]);
        if(s[0]>max && s[0]%K==0){
            max=s[0];
        }
        //遍历
        for(int i=1;i<N;i++){
            len=list.size();
            for(int j=0;j<len;j++){
                sum=list.get(j)+s[i];
                if(!list.contains(sum)){
                    list.add(sum);
                }
                if(sum%K==0 && sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }

    //提高效率--未通过
    public static void solution3(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] s = new int[N];
        int max=0;
        int len,sum;
        for(int m=0;m<N;m++) {
            s[m] = scanner.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(s[0]);
        if(s[0]>max && s[0]%K==0){
            max=s[0];
        }
        //遍历
        for(int i=1;i<N;i++){
            len=list.size();
            for(int j=0;j<len;j++)
            {
                sum=list.get(j)+s[i];
                //如果当前值
                if(sum%K==0)
                {
                    if(sum>max){
                        max=sum;
                    }
                    continue;
                }
                //原来list没有
                if(!list.contains(sum)){
                    list.add(sum);
                }
            }
            if(max!=0 && !list.contains(max)){
                list.add(max);
            }
        }
        Tools.printList(list);
        System.out.println(max);
    }
}
