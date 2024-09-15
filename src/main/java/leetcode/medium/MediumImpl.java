package leetcode.medium;

import leetcode.ListNode;

import java.util.*;

public class MediumImpl implements Medium{

    @Override
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int listCount = 0;
        ListNode tempHead= head;

        // get the list  count
        while (Objects.nonNull(tempHead)){
            listCount++;
            tempHead=tempHead.next;
        }

        // list size is 1 then return null since we can only remove that element
        if(listCount==1){
            return null;
        }

        // if listsize is same as n then that means head will be removed
        // change head to next element and return list
        if(listCount==n){
            head=head.next;
            return head;
        }

        // get the index you have to traverse
        int nodeToRemove= listCount-n;

        ListNode secondIterationNode= head;

        // traverse the list nodeToRemove times
        while(nodeToRemove>1){
            secondIterationNode=secondIterationNode.next;
            nodeToRemove--;
        }

        // you are one node before the node that needs to be removed.
        // point the node to deleted node's next node  return head
        secondIterationNode.next=secondIterationNode.next.next;
        return head;
    }

    @Override
    public ListNode removeNthFromEndUsingTwoPointers(ListNode head, int n) {

        // create a dummyNode
        ListNode dummyNode = new ListNode(0,head);

        ListNode firstNode = dummyNode;
        ListNode secondNode = dummyNode;

        // now iterate first node to the n+1
        for(int i = 0 ; i <=n;i++){
            firstNode=firstNode.next;
        }

        // now while first node is not null move both pointers
        while(Objects.nonNull(firstNode)){
            firstNode=firstNode.next;
            secondNode=secondNode.next;
        }

        // remove the nth node;
        secondNode.next=secondNode.next.next;

        return dummyNode.next;
    }

    @Override
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the list (slow-fast pointer technique)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null, curr = slow, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Merge two halves: first half `head`, second half `prev` (reversed)
        ListNode first = head, second = prev;
        while (second.next != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

    }

    @Override
    public int findDuplicate(int[] nums) {
        Set<Integer>containNumber = new HashSet<>();
        for(Integer each:nums){
            if(containNumber.contains(each)){
                return  each;
            }
            containNumber.add(each);
        }
        return 0;
    }

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();  // Dummy node to simplify result handling
        ListNode current = dummy;
        int carry = 0;

        // Traverse both linked lists
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int newVal = sum % 10;

            current.next = new ListNode(newVal);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;  // Return the next of dummy node to skip the initial dummy node
    }


}
