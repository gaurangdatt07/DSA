package leetcode.easy;

import leetcode.ListNode;

import java.util.*;

public class EasyImpl implements Easy{
    @Override
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // create a dummy node to insert into
        // dummyHead Node serve as the headNode for your newNode.
       ListNode dummyHead=new ListNode();
       ListNode newNode=dummyHead;

       // while both linkedList are not null
       while(Objects.nonNull(list1)&&Objects.nonNull(list2)){
           // in case l1 value is less than add l1 node to newNode.
           if(list1.val<list2.val){
              newNode.next=list1;
              list1=list1.next;
           }// in case l2 value is less than or equal add l2 node to newNode.
           else{
               newNode.next=list2;
               list2=list2.next;
           }
           // move the newNode to the next pointer for appending the next element
           newNode=newNode.next;
       }
       // in case l1 has still some elements left
        // add the pending list to newNode
       if(Objects.nonNull(list1)){
           newNode.next=list1;
       }
       // similarly if l2 has pending elements
       // append it to newNode
       else if(Objects.nonNull(list2)){
           newNode.next=list2;
       }

       // return dummyHead.next;
       return dummyHead.next;
    }

    @Override
    public boolean hasCycle(ListNode head) {
        // create a hashSet
        Set<ListNode>occuredNodes=new HashSet<>();
        // while head is not null
        while(Objects.nonNull(head)){
            // check if node is present in hashSet
            if(occuredNodes.contains(head)){
                // if yes that means linkList has a cycle.
                return true;
            }else{
                // else add the node to set
                occuredNodes.add(head);
            }

            // traverse to next node.
            head=head.next;
        }
        // if null is reached that means no cycle is there return
        return false;
    }

    @Override
    public boolean hasCycleUsingTortoiseAndHare(ListNode head) {
        // initialise two pointers
        ListNode slowPtr=head;
        ListNode fastPtr=head;

        // while fastPointer is not null
        while(Objects.nonNull(fastPtr)&&
        Objects.nonNull(fastPtr.next)){
            // move slow pointer by one and fast by two.
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;

            // if fastPointer is equal to slow pointer
            // that means there exists a loop
            if(fastPtr==slowPtr){
                return true;
            }
        }

        // if loop break that means there is no cycle
        return false;
    }

    @Override
    public ListNode reverseList(ListNode head) {
        // initialise previous node , and current node
        ListNode previousNode=null;
        ListNode currentNode=head;

        // while currentNode is not null
        while(Objects.nonNull(currentNode)){
            // store the current node's next node to iterate the list
            ListNode next=currentNode.next;
            // make current node.next as previous node to change the direction of link(reversed)
            currentNode.next=previousNode;
            // make previous node as current node so that next time you can link it back to current node
            previousNode=currentNode;
            // jump to nextNode
            currentNode=next;
        }

        //return the new head which is the previousNode.
        return previousNode;
    }
}
