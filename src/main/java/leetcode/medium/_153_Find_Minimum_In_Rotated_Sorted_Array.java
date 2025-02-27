package leetcode.medium;

public class _153_Find_Minimum_In_Rotated_Sorted_Array {

    /**
     * @url https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element,
            // it means the minimum element is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, the minimum element is in the left half
                right = mid;
            }
        }

        return nums[left]; // or nums[right], both are the same here
    }
}
