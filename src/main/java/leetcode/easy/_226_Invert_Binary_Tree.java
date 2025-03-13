package leetcode.easy;

import leetcode.model.TreeNode;


/**
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class _226_Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
       if(root==null){
           return root;
       }
       TreeNode temp = root.left;
       root.left=root.right;
       root.right=temp;
       invertTree(root.left);
       invertTree(root.right);
       return root;
    }
}
