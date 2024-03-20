package leetCode.easy;

import leetCode.ListNode;

public interface Easy {
    //https://leetcode.com/problems/two-sum/
    int[] twoSum(int[] nums, int target);
    int[] twoSumOptimised(int[] nums, int target);

    //https://leetcode.com/problems/linked-list-cycle/
     boolean hasCycle(ListNode head);
     boolean hasCycleOptimised(ListNode head);

     // https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
     int getDecimalValue(ListNode head);
}
