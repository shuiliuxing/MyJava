package org.bing.learn.nowcode.字符串.括号序列NC52;

import java.util.Stack;

public class Solution {
    public static void main(String[] args){
        String s="[](([[]]){}{[]}([]))";
        System.out.println(isValid(s));
    }

    public static boolean isValid (String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(')');
            }else if(c=='['){
                st.push(']');
            }else if(c=='{'){
                st.push('}');
            }else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
}
