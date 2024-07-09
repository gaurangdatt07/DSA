package leetcode.medium;

import leetcode.ListNode;

import java.util.Stack;

public class MediumImpl implements Medium{
    @Override
    public String removeStars(String s) {
        int i=0;
        Stack<Character>stack=new Stack<>();
        while(s.length()>i){
            if(s.charAt(i)=='*'){
                stack.pop();
                i++;
                continue;
            }
            stack.push(s.charAt(i));
            i++;
        }
        StringBuilder stringBuilder=new StringBuilder();
        while(!stack.empty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }

    @Override
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast pointer two steps and slow pointer one step at a time
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Remove the middle node
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }
}
