package leetcode;


import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    /**
     * url: https://leetcode.com/problems/contains-duplicate/description/
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        //create a set
        Set<Integer> set = new HashSet<>();
        // for all integer in the array.
        for (int num : nums) {
            // check if number exists in the set.
            if (set.contains(num))
                // number exists in set hence duplicate found.
                return true;
            // else add the number to the set
            set.add(num);
        }
        // since all numbers are unique return false
        return false;
    }
}


