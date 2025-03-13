package leetcode.easy;

import leetcode.model.TreeNode;

/**
 * URL: https://leetcode.com/problems/same-tree/
 */
public class _100_Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        return p != null && q != null && p.val == q.val &&
                isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
