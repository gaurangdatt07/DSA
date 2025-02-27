package leetcode.easy;

public class _35_Search_Insert_Position {
    /**
     * @url https://leetcode.com/problems/search-insert-position/description/
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0 ; int right = nums.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }
}
