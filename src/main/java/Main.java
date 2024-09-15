import leetcode.ListNode;
import leetcode.medium.Medium;
import leetcode.medium.MediumImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Medium medium=new MediumImpl();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // Linking the nodes together to form the list 1 -> 2 -> 3 -> 4
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        medium.reorderList(node1);

    }
}
