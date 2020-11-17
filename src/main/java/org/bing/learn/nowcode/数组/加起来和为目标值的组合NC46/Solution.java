package org.bing.learn.nowcode.数组.加起来和为目标值的组合NC46;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        int[] num={100, 10, 20, 70, 60, 10, 50};
        int target=80;
        int n=num.length;
        ArrayList<ArrayList<Integer>> allList=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            if(target==num[i]){
                ArrayList<Integer> tmpList=new ArrayList<>();
                tmpList.add(target);
                allList.add(tmpList);
            }else if(target>num[i]){
                ArrayList<Integer> tmpList=new ArrayList<>();
                tmpList.add(num[i]);
                boolean flag=find(i+1,num,target-num[i],tmpList);
                if(tmpList.size()>1 && flag) {
                    allList.add(tmpList);
                }
            }
        }
    }

//
//    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
//
//    }

    public static boolean find(int k,int[] num,int target,ArrayList<Integer> list){
        if(k>=num.length){
            return false;
        }
        if(target==num[k]){
            list.add(num[k]);
            return true;
        }else if(target>num[k]) {
            return find(k+1,num,target-num[k],list);
        }else{
            return find(k+1,num,target,list);
        }
    }
}
