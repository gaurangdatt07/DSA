package gfg.linkedList;

public class Node {

    Node next;
    int value;

    public Node() {
    }

    public Node(int value) {

        this.value = value;
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        first.next=second;
        second.next=third;
        third.next=four;
        four.next=five;
        five.next=six;

//      NbyKNode nbyKNode = new NbyKNode();
//        ModularNode modularNode = new ModularNode();
//        System.out.println(modularNode.modularNode(first,3));
    }
}
