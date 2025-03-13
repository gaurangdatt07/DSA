package leetcode.easy;


import leetcode.model.TreeNode;

/**
 * url:https://leetcode.com/problems/balanced-binary-tree/description/
 */
public class _110_Balanced_Binary_Tree {
    boolean isBalanced=true;
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        if (leftHeight == -1) return -1; // If left subtree is unbalanced, stop checking

        int rightHeight = height(root.right);
        if (rightHeight == -1) return -1; // If right subtree is unbalanced, stop checking

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // If this node is unbalanced, propagate -1
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
