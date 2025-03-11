package leetcode.easy;

import java.util.HashMap;

/**
 * url: https://leetcode.com/problems/majority-element/
 */
public class _169_Majority_Elements {

    public int majorityElement(int[] nums) {
        int expectedLength= nums.length/2;
        HashMap<Integer,Integer>frequencyMap = new HashMap<>();

        for(Integer num:nums){
            Integer frequency = frequencyMap.getOrDefault(num, 0);
            if(frequency>=expectedLength){
                return num;
            }
            frequencyMap.put(num,++frequency);
        }
        return 0;
    }
}
