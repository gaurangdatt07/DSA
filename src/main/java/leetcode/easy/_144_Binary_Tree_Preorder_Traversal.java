package leetcode.easy;

import leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class _144_Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>preOrderList= new ArrayList<>();
        getPreOrderList(root,preOrderList);
        return preOrderList;
    }

    // pre order list is root -> left -> right
    private void getPreOrderList(TreeNode root, List<Integer> preOrderList) {
        if(Objects.isNull(root)){
            return;
        }

        preOrderList.add(root.val);
        getPreOrderList(root.left,preOrderList);
        getPreOrderList(root.right,preOrderList);
    }
}
