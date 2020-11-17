package org.bing.learn.nowcode.链表.链表中倒数第k个结点NC69;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    class ListNode {
        int val;
        ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        List<ListNode> list=new ArrayList<ListNode>();
        while(head!=null){
            list.add(head);
            head=head.next;
        }
        int size=list.size();
        if(k==0 || k>size){
            return null;
        }
        return list.get(list.size()-k);
    }
}
