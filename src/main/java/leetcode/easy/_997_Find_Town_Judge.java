package leetcode.easy;

import java.util.HashMap;

public class _997_Find_Town_Judge {
    //https://leetcode.com/problems/find-the-town-judge/
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer>incomingRequests=new HashMap<>();
        HashMap<Integer,Integer>outgoingRequests=new HashMap<>();
        // for each node
        for(int[]t:trust){
            int truster=t[0]; // person
            int trustee=t[1]; // person he trusts

            incomingRequests.put(trustee,incomingRequests.getOrDefault(trustee,0)+1);
            outgoingRequests.put(truster,outgoingRequests.getOrDefault(truster,0)+1);
        }


        for(int i =1;i<=n;i++){
            if(incomingRequests.getOrDefault(i,0)==n-1 // incoming will be n-1 beacuse everyone trusts him except judge
            && outgoingRequests.getOrDefault(i,0)==0){  //outgoing is 0 since he trusts none
                return i; // judgeFound
            }
        }

        return -1;

    }
}
