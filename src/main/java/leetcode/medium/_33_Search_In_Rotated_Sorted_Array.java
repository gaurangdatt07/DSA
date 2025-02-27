package leetcode.medium;

public class _33_Search_In_Rotated_Sorted_Array {

    /**
     * @url https://leetcode.com/problems/search-in-rotated-sorted-array/description/
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0;int right = nums.length-1;

        while (left<=right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){return mid;}

            // Determine which half is sorted
            if(nums[left]<=nums[mid]){ // Left half is sorted
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1; // search in unsorted half.
                }else{
                    left=mid+1; // search in sorted half.
                }
            }else{
                if(target>nums[mid]&&target<=nums[right]){
                    left=mid+1; // search in right half
                }else {
                    right=mid-1; // search in left half.
                }
            }
        }
        return -1; // target not found
    }
}
