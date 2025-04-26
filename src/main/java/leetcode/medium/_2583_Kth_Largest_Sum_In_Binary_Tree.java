package leetcode.medium;

import leetcode.models.TreeNode;

import java.util.*;

public class _2583_Kth_Largest_Sum_In_Binary_Tree {
    // https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/description/
    public long kthLargestLevelSum(TreeNode root, int k) {

        List<Integer> levelSum=new ArrayList<>();
        getLevelSum(root,levelSum);
        Collections.sort(levelSum);
        return levelSum.size()>k?levelSum.get(k-1):-1;
    }

    private void getLevelSum(TreeNode root, List<Integer> levelSum) {
        if(root==null){
            return;
        }

    }
}
