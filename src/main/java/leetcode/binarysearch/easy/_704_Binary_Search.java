package leetcode.binarysearch.easy;

public class _704_Binary_Search {
    // https://leetcode.com/problems/binary-search/description/

    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0 ; int right = nums.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){
                return mid;
            }

            if(nums[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }

        return -1 ;
    }
}
