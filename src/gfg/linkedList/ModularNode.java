package gfg.linkedList;

public class ModularNode {

    int modularNode(Node head,int k){
        Node tempNode= head;
        int value= -1,index=1;
        while (tempNode!=null){
            if(index%k==0)
                value= tempNode.value;
            tempNode=tempNode.next;
            index++;
        }

        return value;
    }
}
