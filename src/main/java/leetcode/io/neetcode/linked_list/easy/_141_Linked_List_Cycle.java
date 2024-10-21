package leetcode.io.neetcode.linked_list.easy;


import entities.ListNode;

/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be
 * reached again by continuously following the next pointer. Internally,
 * pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class _141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {

        // create a slow pointer and a fast pointer
        ListNode slowPointer=head;
        ListNode fastPointer=head;

        // traverse till fast pointer is not null
        while(fastPointer!=null&&fastPointer.next!=null){
            // traverse both the pointers.
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;

            // if slow pointer is same as fast then there is cycle.
            if(slowPointer.equals(fastPointer)){return true;}

        }

        //else no cycle
        return false;
    }

}
