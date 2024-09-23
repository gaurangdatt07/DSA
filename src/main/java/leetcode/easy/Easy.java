package leetcode.easy;

import leetcode.ListNode;
import leetcode.TreeNode;


public interface Easy {

    /**
     * https://leetcode.com/problems/contains-duplicate/description/
     * ARRAYS AND HASHING E1
     */
    boolean containsDuplicate(int[] nums);

    /**
     * https://leetcode.com/problems/valid-anagram/
     * Arrays & Hashing E2
     */
    boolean isAnagram(String s, String t);

    /**
     * https://leetcode.com/problems/two-sum/description/
     * Arrays & Hashing E3
     */
    int[] twoSum(int[] nums, int target);

    /**
     * https://leetcode.com/problems/valid-parentheses/description/
     * STACK E1
     */
    boolean isValid(String s);

    /**
     *https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     * SLIDING WINDOW E1
     */
    int maxProfit(int[] prices);

    /**
     * https://leetcode.com/problems/invert-binary-tree/
     * TREE E1
     */
    TreeNode invertTree(TreeNode root);

    /**
     *https://leetcode.com/problems/maximum-depth-of-binary-tree/
     * TREE E2
     */
    int maxDepth(TreeNode root);



}
