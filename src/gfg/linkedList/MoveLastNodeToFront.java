package gfg.linkedList;

public class MoveLastNodeToFront {
    Node moveLastNodeToFront(Node head){

        Node tempHead = head;

        if(tempHead.next==null)
            return head;
        while(tempHead.next.next!=null)
            tempHead = tempHead.next;


        tempHead.next.next=head;
        head = tempHead.next;
        tempHead.next=null;

        return head;
    }


}
