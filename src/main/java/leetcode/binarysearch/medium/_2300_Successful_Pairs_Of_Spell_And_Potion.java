package leetcode.binarysearch.medium;

import java.util.Arrays;

public class _2300_Successful_Pairs_Of_Spell_And_Potion {
    // https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // sort array
        Arrays.sort(potions);
        int[] result = new int[spells.length];

        // for each spell
        for(int i = 0 ; i <spells.length ; i++){
            // check the last index which does not match your condition.
            int left=0;int right=potions.length-1;
            int weakestIndex=potions.length;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(success<= (long) spells[i] *potions[mid]){
                    right=mid-1;weakestIndex=mid;
                }else{
                    left=mid+1;
                }
            }
            result[i]=potions.length-weakestIndex;

        }
        return result;
    }
}
