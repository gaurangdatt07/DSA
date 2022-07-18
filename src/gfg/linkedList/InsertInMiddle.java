package gfg.linkedList;

public class InsertInMiddle{

    Node insertInMiddle(Node head , int data){

        Node fast = head.next;
        Node slow = head;

        while(fast.next!=null && fast!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        Node newNode = new Node(data);
        newNode.next=slow.next;
        slow.next= newNode;

        return head;
    }
}
