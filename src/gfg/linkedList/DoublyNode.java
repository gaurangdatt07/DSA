package gfg.linkedList;

public class DoublyNode {


        DoublyNode next;
        DoublyNode prev;
        int data;

        public DoublyNode() {}


        public DoublyNode(int data) {
            this.data = data;
        }



    public static void main(String[] args) {
        DoublyNode first = new DoublyNode(1);
        DoublyNode second = new DoublyNode(2);
        DoublyNode third = new DoublyNode(3);
        DoublyNode four =  new DoublyNode(4);

        first.next = second;
        second.prev  = first;
        second.next = third;
        third.prev = second;
        third.next = four;
        four.prev = third;
        four.next = null;
    }
}

