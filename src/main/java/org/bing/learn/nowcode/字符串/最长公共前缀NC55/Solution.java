package org.bing.learn.nowcode.字符串.最长公共前缀NC55;

public class Solution {
    public static void main(String[] args){
        String[] strs={};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String res="";
        //遍历strs[0]的每一个字符，每个字符分别去比较 strs[1]、strs[2]、strs[3]......的相同位置上字符
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            int k=0;
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length() && c==strs[j].charAt(i)){
                    k++;
                }else{
                    break;
                }
            }
            if(k==strs.length-1){
                res+=String.valueOf(c);
            }else{
                break;
            }
        }
        return res;
    }
}
