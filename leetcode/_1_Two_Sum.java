package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {
    /**
     * URL: https://leetcode.com/problems/two-sum/description/
     */
    public int[] twoSum(int[] nums, int target){
        // create a hashmap to store value as key and idex as value.
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // check if map contains key with compliment.
            if (map.containsKey(target - nums[i])) {
                // found value return index.
                return new int[]{map.get(target - nums[i]), i};
            }
            // else add the value to map value as key index as value.
            map.put(nums[i], i);
        }
        return null;
    }
}
