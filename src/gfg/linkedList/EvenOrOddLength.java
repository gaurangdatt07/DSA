package gfg.linkedList;

public class EvenOrOddLength {

    int isLenghtEvenOrOdd(Node head){

        int count = 0;

        while(head!=null){
            count++;
            head=head.next;
        }
        if(count%2==0) return 0;

        return 1;
    }
}
