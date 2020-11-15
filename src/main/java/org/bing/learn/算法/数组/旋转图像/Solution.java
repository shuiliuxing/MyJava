package org.bing.learn.算法.数组.旋转图像;

public class Solution {
    public static void main(String[] args){
        int[][] matrix1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matrix={
                { 5, 1, 9,11},
                { 2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
        rotate(matrix);

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        //对换对角线
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        //中间对称交换
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=tmp;
            }
        }
    }

}