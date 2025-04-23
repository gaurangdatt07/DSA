package leetcode.greedy.medium;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class _781_Rabbits_In_Forest {

    // https://leetcode.com/problems/rabbits-in-forest/description

    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>sameRabbitsFreq=new HashMap<>();
        int count = 0;
        for(Integer rabbit :answers){
            if(rabbit==0){
                count++;
            }
            else if(!sameRabbitsFreq.containsKey(rabbit)){
                sameRabbitsFreq.put(rabbit,1);
            } else if (sameRabbitsFreq.containsKey(rabbit)&&(sameRabbitsFreq.get(rabbit)+1)<rabbit) {
                sameRabbitsFreq.put(rabbit,sameRabbitsFreq.get(rabbit)+1);
            }else{
                count++;
                sameRabbitsFreq.put(rabbit,0);
            }
        }
        List<Integer> values = sameRabbitsFreq.values().stream().toList();
        for(Integer value:values){
            count+=value;
        }
        return count;
    }
}
