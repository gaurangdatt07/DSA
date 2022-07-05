package gfg.linkedList;

import java.util.ArrayList;

public class DetectLoop {

    static class Node{
        Node next;
        int value;

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }



Boolean detectLoop(Node node){


      ArrayList  myList = new ArrayList<>();
        Node tempHead = node;

        while (tempHead.next!=null){
                if(myList.contains(tempHead)) return  true;
                myList.add(tempHead);
                tempHead=tempHead.next;

        }


        return false;

    }
}
