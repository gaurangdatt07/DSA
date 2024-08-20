package leetcode.easy;

import leetcode.ListNode;


public interface Easy {
    /**
     *  https://leetcode.com/problems/merge-two-sorted-lists/description/
     */
    ListNode mergeTwoLists(ListNode list1, ListNode list2);

    /**
     * https://leetcode.com/problems/linked-list-cycle/description/
     */
    boolean hasCycle(ListNode head);
    boolean hasCycleUsingTortoiseAndHare(ListNode head);

    /**
     * https://leetcode.com/problems/reverse-linked-list/description/
     */
    ListNode reverseList(ListNode head);
}
