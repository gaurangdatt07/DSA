package leetcode.medium;

import leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class _230_Kth_Smallest_element_In_A_BST {
    public int kthSmallest(TreeNode root, int k) {

        // list of all elements in the tree
        List<Integer> elementsInTree=new ArrayList<>();
        // inOrder traversal since it will give elements in sorted array;
        inOrderTraversal(root,elementsInTree);
        // return k-1 index.
        return elementsInTree.get(k-1);

    }

    // inOrder Traversal is left->root->right
    private void inOrderTraversal(TreeNode root, List<Integer> elementsInTree) {
      if(Objects.isNull(root)){
          return ;
      }
      inOrderTraversal(root.left,elementsInTree);
      elementsInTree.add(root.val);
      inOrderTraversal(root.right,elementsInTree);
    }
}
