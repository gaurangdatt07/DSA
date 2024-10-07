package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_Three_Sum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to use the two-pointer approach
        Arrays.sort(nums);

        // Iterate through the array, considering each element as the first element of the triplet
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i]>0) {
                return result;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a valid triplet, add to result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move both pointers inward and skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    // If the sum is less than zero, move the left pointer to increase the sum
                    left++;
                } else {
                    // If the sum is greater than zero, move the right pointer to decrease the sum
                    right--;
                }
            }
        }

        return result;

    }
}
