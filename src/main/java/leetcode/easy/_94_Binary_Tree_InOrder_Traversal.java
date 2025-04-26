package leetcode.easy;

import leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _94_Binary_Tree_InOrder_Traversal {
    //https://leetcode.com/problems/binary-tree-inorder-traversal/description/
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>values=new ArrayList<>();
        getInOrder(root,values);
        return values;

    }

    private void getInOrder(TreeNode root, List<Integer> values) {
        if(root==null){
            return;
        }
        getInOrder(root.left,values);
        values.add(root.val);
        getInOrder(root.right,values);
    }
}
