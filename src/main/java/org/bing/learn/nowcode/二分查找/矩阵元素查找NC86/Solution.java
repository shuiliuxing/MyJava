package org.bing.learn.nowcode.二分查找.矩阵元素查找NC86;

import org.bing.work.基本工具.Tools;
/*
    未解决
 */
public class Solution {
    public static void main(String[] args) {
        int[][] array={
                    {0,164,328,492,656,820,984,1148,1312,1476,1640,1804,1968,2132,2296,2460,2624,2788,2952,3116,3280,3444,3608,3772,3936,4100,4264,4428,4592,4756,4920,5084,5248,5412,5576,5740,5904,6068,6232,6396,6560,6724,6888,7052,7216,7380,7544,7708,7872,8036,8200,8364,8528,8692,8856,9020,9184,9348,9512,9676,9840,10004,10168,10332,10496,10660,10824,10988,11152,11316,11480},
                    {4,168,332,496,660,824,988,1152,1316,1480,1644,1808,1972,2136,2300,2464,2628,2792,2956,3120,3284,3448,3612,3776,3940,4104,4268,4432,4596,4760,4924,5088,5252,5416,5580,5744,5908,6072,6236,6400,6564,6728,6892,7056,7220,7384,7548,7712,7876,8040,8204,8368,8532,8696,8860,9024,9188,9352,9516,9680,9844,10008,10172,10336,10500,10664,10828,10992,11156,11320,11484}
        };
        for(int i=1;i<30;i++) {
            System.out.print("靠,"+71+"\t");
            int[] result = findElement(array, 3, 6, i);
            int[] result2 = findElement3(array, 3, 6, i);
            Tools.print(result);
            Tools.print(result2);
            System.out.println();
        }
    }

    public static int[] findElement(int[][] mat, int n, int m, int x) {
        int[] result=new int[2];
        int left=0;
        int high=n*m-1;
        int mid,i,j;
        while (left<=high){
            mid=(left+high)/2;
            i=mid/m;
            j=(mid-mid/m*m)%m;
            if(x==mat[i][j]){
                result[0]=i;
                result[1]=j;
                return result;
            }else if(x>mat[i][j]){
                left=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }

    public static int[] findElement2(int[][] mat, int n, int m, int x) {
        // write code here
        int [] temp = {-1,-1};

        int i = 0;
        int len = n-1;
        while((n >= 0)&& (i < m)){
            if(mat[len][i] > x){
                len--;
            }else if(mat[len][i] < x){
                i++;
            }else{
                temp[0] = len;
                temp[1] = i;
                return temp;
            }
        }
        return temp;
    }

    public static int[] findElement3(int[][] mat, int n, int m, int x) {
        // write code here
        int[] a = new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==x){
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        return a;
    }
}
