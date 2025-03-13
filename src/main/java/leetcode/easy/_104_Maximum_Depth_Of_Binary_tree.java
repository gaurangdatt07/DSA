package leetcode.easy;


import leetcode.model.TreeNode;

/**
 * url: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class _104_Maximum_Depth_Of_Binary_tree {

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
