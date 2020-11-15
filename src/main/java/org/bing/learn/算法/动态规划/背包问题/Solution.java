package org.bing.learn.算法.动态规划.背包问题;

import jdk.nashorn.internal.runtime.QuotedStringTokenizer;

public class Solution {

    static int totalweight= 10;
    static int N= 5;
    static int weights[] = {6, 2, 1, 8, 2};
    static int values[] = {20, 30, 50, 60, 80};

    public static void main(String[] args){
        int weight[]={6,3,9,8,2};
        int value[]={40,20,32,13,80};
        //抽取5件物品，限制在20kg,使得总价值最大
        //System.out.println(dp1(weight,value,4,10));
        dp2();
    }

    //递归
    public static int dp1(int[] weight,int[] value,int i,int W){
        if(i==-1 || W<weight[i]){
            return 0;
        }
        int r1 = dp1(weight, value, i - 1, W - weight[i]) + value[i];   //放第i个物品
        int r2 = dp1(weight, value, i - 1, W);  //不放物品
        return Math.max(r1,r2);
    }

    //非递归
    public static void dp2(){
        int f[] = new int[10+1];

        for (int i=0;i<N;i++)
        {
            int w = weights[i];
            int v = values[i];
            for (int j= 10;j>=w;j--)
            {
                System.out.print(j+"\tf["+j+"]=max("+f[j]+","+(f[j-w]+v)+")");
                f[j] = Math.max(f[j],f[j-w]+v);
                System.out.print("\t\t"+f[j]+"\n");
            }
        }
        //System.out.println(f[10]);
    }

}

