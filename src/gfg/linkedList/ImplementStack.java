package gfg.linkedList;

public class ImplementStack {

    Node top;

    void push(int num){
        Node temp = new Node(num);
        temp.next = top;
        top = temp;
    }
    int pop(){

        if(top==null)
            return -1;
        Node temp = top;
        top=top.next;
        return temp.value;

    }

}
