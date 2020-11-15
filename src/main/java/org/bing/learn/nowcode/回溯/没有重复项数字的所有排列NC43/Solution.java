package org.bing.learn.nowcode.回溯.没有重复项数字的所有排列NC43;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    static Set<String> set=new TreeSet<>();

    public static void main(String[] args){
        int[] num={6,5};
        System.out.println(permute1(num));
    }

    public static ArrayList<ArrayList<Integer>> permute(int[] num) {
        int from=0;
        int to=num.length-1;
        listAll(num, from, to);
        ArrayList<ArrayList<Integer>> allList=new ArrayList<ArrayList<Integer>>();
        for(String s:set){
            ArrayList<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<s.length();i++){
                list.add(Integer.valueOf(String.valueOf(s.charAt(i))));
            }
            allList.add(list);
        }
        if(set.isEmpty()){
            allList.add(new ArrayList<Integer>());
        }
        return allList;
    }

    public static void listAll(int[] num, int from, int to){
        if(from==to){
            String str="";
            for(int i=0;i<=to;i++){
                str+=num[i];
            }
            set.add(str);
        }else{
            for(int j=from;j<=to;j++){
                swap(num,from,j);
                listAll(num,from+1,to);
                swap(num,from,j);
            }
        }
    }

    public static void swap(int[] num, int i, int j){
        int tmp=num[i];
        num[i]=num[j];
        num[j]=tmp;
    }


    public static void dfs(int[] nums, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res) {
        // 终止条件
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) {
                continue;
            }
            path.add(nums[i]);
            dfs(nums, path, res);
            path.remove(path.size() - 1);
        }

    }
    public static ArrayList<ArrayList<Integer>> permute1(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        dfs(num, path, res);
        return res;
    }
}
