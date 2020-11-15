package org.bing.learn.编程之法.数组.跳台阶问题;

public class Solution {
    public static void main(String[] args) {
        int n=4;
        System.out.println(fibonacci(n));

    }

    //每次跳1级、2级
    public static int fibonacci(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    //每次跳1级、2级、3级......
    public static int fibonacci2(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else if(n==3){
            return 4;
        }else {
            return fibonacci(n-1)+fibonacci(n-2)+fibonacci(n-3);
        }
    }

}
