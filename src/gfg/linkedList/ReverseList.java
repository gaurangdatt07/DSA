package gfg.linkedList;

public class ReverseList {




    Node reverseList(Node node){

        Node prev = null;
        Node tempHead = node ;
        Node next = tempHead.next;
        while ( tempHead!=null){
            next=tempHead.next;
            tempHead.next=prev;
            prev=tempHead;
            tempHead=next;
        }

        return node;
    }
}
