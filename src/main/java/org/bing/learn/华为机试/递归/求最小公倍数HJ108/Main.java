package org.bing.learn.华为机试.递归.求最小公倍数HJ108;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int a=A>B?A:B;
        int b=A>B?B:A;
        while((a-b)!=0){
            int tmp=a-b;
            a=b>tmp?b:tmp;
            b=b>tmp?tmp:b;
        }
        System.out.println(A*B/b);
    }
}
