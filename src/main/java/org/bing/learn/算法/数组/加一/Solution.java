package org.bing.learn.算法.数组.加一;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        int[] digits={1,8,7,6,5,4,9,9};
        plusOne1(digits);
        for (int digit : digits) {
            System.out.print(digit + "\t");
        }
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> list=new ArrayList<>();
        int len=digits.length;
        int tmp,s=0;
        for(int i=len-1;i>=0;i--){
            if(i==len-1){
                tmp=digits[i]+1;
            }else {
                tmp = digits[i] + s;
            }
            s=0;
            if(tmp>=10){
                s++;
                tmp = tmp - 10;
            }
            if(i==0 && tmp==0){
                list.add(0);
                list.add(1);
            }else {
                list.add(tmp);
            }
        }
        int[] arr=new int[list.size()];
        int k=0;
        for (int i=list.size()-1;i>=0;i--,k++){
            arr[k]=list.get(i);
        }
        return arr;
    }

    //高效率
    public static int[] plusOne1(int[] digits) {
        int len = digits.length;
        for(int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if(digits[i]!=0) {
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }


}
