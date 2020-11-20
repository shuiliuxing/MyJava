package org.bing.learn.华为机试.字符串.单词倒排HJ31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int n=1001;
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]="";
        }
        int index=0;
        for(int i=0;i<str.length();i++){
            //如果是字母
            if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z')){
                arr[index]+=str.charAt(i);
            }else{
                if(i>=1 && ((str.charAt(i-1)>='a' && str.charAt(i-1)<='z')||(str.charAt(i-1)>='A' && str.charAt(i-1)<='Z'))){
                    index++;
                }
            }
        }
        for(int i=index;i>=0;i--){
            if(!arr[i].equals("")) {
                if (i == 0) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}