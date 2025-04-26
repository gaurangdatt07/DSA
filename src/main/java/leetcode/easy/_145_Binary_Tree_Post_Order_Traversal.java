package leetcode.easy;

import leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class _145_Binary_Tree_Post_Order_Traversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrderValues=new ArrayList<>();
        getPostOrderValues(root,postOrderValues);
        return postOrderValues;
    }

    // post order is left-> right-> node
    private void getPostOrderValues(TreeNode root, List<Integer> postOrderValues) {
        if(Objects.isNull(root)){
            return;
        }
        getPostOrderValues(root.left,postOrderValues);
        getPostOrderValues(root.right,postOrderValues);
        postOrderValues.add(root.val);
    }
}
