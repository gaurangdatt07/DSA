package leetcode.easy;

import java.util.HashMap;

public class _1_Two_Sum {
    /**
     * url: https://leetcode.com/problems/two-sum/
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> complimentMap = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){
            int diff = target - nums[i];
            if(complimentMap.containsKey(diff)){
                return new int[]{complimentMap.get(diff),i};
            }
            complimentMap.put(nums[i],i );
        }
        return new int[]{};
    }
}
