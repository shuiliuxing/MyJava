package org.bing.learn.nowcode.树.二叉树的层次遍历NC15;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
        if (root == null) {
            return allList;
        }
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int num = queue.size();
            ArrayList<Integer> numList = new ArrayList<Integer>();
            for (int i = 0; i < num; i++) {
                TreeNode node = queue.peekFirst();
                numList.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                queue.poll();
            }
            allList.add(numList);
        }
        return allList;
    }
}
