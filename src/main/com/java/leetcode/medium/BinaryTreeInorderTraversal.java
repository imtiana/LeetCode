package main.com.java.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);

        while (root.left != null) {
            s.add(root.left);
            root = root.left;
        }

        while (!s.isEmpty()) {
            TreeNode next = s.pop();
            System.out.println(next.val);
            result.add(next.val);

            if (next.right != null) {
                next = next.right;
                s.push(next);

                while (next.left != null) {
                    next = next.left;
                    s.push(next);
                }
            }
        }

        return result;
    }

}
