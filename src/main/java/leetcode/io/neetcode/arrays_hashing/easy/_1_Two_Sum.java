package leetcode.io.neetcode.arrays_hashing.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 */
public class _1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        // create a map to store complement of a number and the index.
        Map<Integer,Integer> complementToIndexMap=new HashMap<>();

        // traverse the array
        for(int i = 0 ; i <nums.length;i++){
            // calculate the difference between target and number at index i.
            int difference = target-nums[i];

            // check if that number is present in the map
            if(complementToIndexMap.containsKey(difference)){

                // if yes then return the index of that number and current index
                return new int[]{i,complementToIndexMap.get(difference)};
            }

            // else put the nums[i] as key and value as current index
            complementToIndexMap.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}
