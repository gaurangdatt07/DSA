package gfg.linkedList;

import java.util.ArrayList;

public class DetectLoop {





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
