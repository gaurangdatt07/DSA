package gfg.linkedList;

public class DeleteInDoubly {


    DoublyNode deleteNode(DoublyNode head ,  int x){

        DoublyNode temp  = head;

        while(x-->1){
            temp = temp.next;
        }

        if(temp.next==null){
            temp.prev.next = null;
                    return head;
        }
        if(temp.prev==null){
            head = temp.next;
            return head;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp = null;

        return head;

    }
}
