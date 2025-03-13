package leetcode.easy;

import leetcode.model.TreeNode;

/**
 * url: https://leetcode.com/problems/diameter-of-binary-tree/description/
 */
public class _543_Diameter_Of_Binary_tree {
    int diameterOfTree=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameterOfTree;

    }

    private int height(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftHeigh=height(root.left);
        int rightHeigh=height(root.right);

        diameterOfTree=Math.max(diameterOfTree,leftHeigh+rightHeigh);

        return 1+Math.max(leftHeigh,rightHeigh);
    }
}
