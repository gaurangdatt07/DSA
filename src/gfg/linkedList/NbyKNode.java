package gfg.linkedList;

public class NbyKNode extends Node{


    int nkNode(Node head, int k ){

        Node tempHead = head;
        int count = 0;
        while(tempHead!=null)
        {
            tempHead = tempHead.next;
            count++;
        }
        int val  = (int)Math.ceil((double)count/k);
        tempHead=head;
        while(val-->1){
            tempHead=tempHead.next;
        }
        return tempHead.value;
    }
}
