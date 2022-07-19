package gfg.linkedList;

public class IdenticalLinkList {

    boolean areIdentical(Node head1,Node head2){
        while(head1!=null && head2!=null){
            if(head1.value!=head2.value){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        if(head1!=null || head2!=null)
            return false;
        return true;
    }
}
