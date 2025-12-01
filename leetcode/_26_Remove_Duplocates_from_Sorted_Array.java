package leetcode;

public class _26_Remove_Duplocates_from_Sorted_Array {
    // URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public int removeDuplicates(int[] nums) {
        int uniqueCounter=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[uniqueCounter]){
                uniqueCounter++;
                nums[uniqueCounter] = nums[i];
            }
        }
        return ++uniqueCounter;
    }
}
