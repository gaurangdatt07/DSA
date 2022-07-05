package gfg.linkedList;

public class ReverseList {

    static class Node{
        Node next;
        int value;

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }


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
