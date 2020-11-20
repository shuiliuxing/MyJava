package org.bing.learn.华为机试.链表.输出单链表的第k个结点;

import java.util.Scanner;

class ListNode{
    int m_nKey;
    ListNode m_pNext;

    public ListNode(int m_nKey){
        this.m_nKey=m_nKey;
        this.m_pNext=null;
    }
}

public class Main {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            ListNode head=new ListNode(scan.nextInt());
            ListNode node=head;
            for(int i=1;i<n;i++){
                node.m_pNext=new ListNode(scan.nextInt());
                node=node.m_pNext;
            }
            int k=scan.nextInt();
            //K输入为0的情况
            if(k==0){
                System.out.println(0);
            }else{
                int index = 0;
                ListNode pre = head;
                while (pre != null) {
                    if (index == (n - k)) {
                        System.out.println(pre.m_nKey);
                        break;
                    }
                    pre = pre.m_pNext;
                    index++;
                }
            }
        }
    }
}
