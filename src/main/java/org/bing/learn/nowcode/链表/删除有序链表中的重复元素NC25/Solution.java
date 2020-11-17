package org.bing.learn.nowcode.链表.删除有序链表中的重复元素NC25;

public class Solution {
    class ListNode {
        int val;
        ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }

    public ListNode deleteDuplicates (ListNode head) {
        if(head==null){
            return null;
        }
        ListNode node=head;
        while(node.next!=null){
            if(node.next.val==node.val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
        return head;
    }
}
