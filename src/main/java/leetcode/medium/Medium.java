package leetcode.medium;

import leetcode.ListNode;

import java.util.List;

public interface Medium {

    /**
     * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
     */
    ListNode removeNthFromEnd(ListNode head, int n);
    ListNode removeNthFromEndUsingTwoPointers(ListNode head, int n);

    /**
     * https://leetcode.com/problems/reorder-list/description/
     */
    void reorderList(ListNode head);


    /**
     * https://leetcode.com/problems/find-the-duplicate-number/description/
     */
    int findDuplicate(int[] nums);

    /**
     * https://leetcode.com/problems/add-two-numbers/
     */
    ListNode addTwoNumbers(ListNode l1, ListNode l2);
}
