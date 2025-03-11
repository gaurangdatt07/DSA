package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    /**
     * url:https://leetcode.com/problems/contains-duplicate/
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> encounteredNums= new HashSet<>();

        for(Integer num:nums){
            if(encounteredNums.contains(num)){
                return true;
            }
            encounteredNums.add(num);
        }
        return false;
    }
}
