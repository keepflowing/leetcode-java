package n0094_btinordertraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            if(current == null) {
                current = stack.pop();
                res.add(current.val);
                current = current.right;
            }
            else {
                stack.push(current);
                current = current.left;
            }
        }
        return res;
    }

    public List<Integer> inorderTraversalRec(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        rec(root, res);
        return res;
    }

    public void rec(TreeNode root, ArrayList<Integer> res) {
        if(root != null) {
            rec(root.left, res);
            res.add(root.val);
            rec(root.right, res);
        }
    }
}