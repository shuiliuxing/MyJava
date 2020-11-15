package org.bing.learn.nowcode.链表.反转链表NC78;

import java.util.Stack;

public class Solution {

    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        Stack<Integer> stack=new Stack<Integer>();
        ListNode preNode=head;
        while (preNode!=null){
            stack.push(preNode.val);
            preNode=preNode.next;
        }
        preNode=head;
        while (!stack.isEmpty()){
            preNode.val=stack.pop();
            preNode=preNode.next;
        }
        return head;
    }
}
