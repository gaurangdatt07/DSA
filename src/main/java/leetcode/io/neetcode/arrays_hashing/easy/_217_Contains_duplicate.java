package leetcode.io.neetcode.arrays_hashing.easy;

import java.util.HashSet;
import java.util.Set;

public class _217_Contains_duplicate {
    /**
     *  Given an integer array nums, return true if any value appears at least twice in the array,
     *  and return false if every element is distinct.
     */
    public boolean containsDuplicate(int[] nums){
        // create a hashSet
        Set<Integer> occuredNumbers=new HashSet<>();

        // traverse through the array num.
        for(Integer num:nums){

            // if num is present in set then return true.
            if(occuredNumbers.contains(num)){
                return true;
            }

            // else add the number to the set.
            occuredNumbers.add(num);
        }

        // if all number in array is distinct then return false.
        return false;
    }
}
