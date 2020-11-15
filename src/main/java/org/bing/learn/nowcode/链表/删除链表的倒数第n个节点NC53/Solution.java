package org.bing.learn.nowcode.链表.删除链表的倒数第n个节点NC53;

public class Solution {
    public static void main(String[] args){
        ListNode head=new ListNode(0);
        int n=3;
        System.out.println(removeNthFromEnd(head,n));
    }

    public static ListNode removeNthFromEnd (ListNode head, int n) {
        int len=0;
        ListNode preNode=head.next;
        while (preNode!=null){
            len++;
            preNode=preNode.next;
        }
        int delNum=len-n;
        ListNode qNode=head.next;
        int num=1;
        while (qNode!=null){
            if(num==delNum){
                qNode.next=qNode.next.next;
                break;
            }
            qNode=qNode.next;
            num++;
        }
        return head;
    }
}
