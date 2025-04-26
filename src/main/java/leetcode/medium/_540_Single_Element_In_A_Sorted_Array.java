package leetcode.medium;

public class _540_Single_Element_In_A_Sorted_Array {
    //https://leetcode.com/problems/single-element-in-a-sorted-array/description/

    public int singleNonDuplicate(int[] nums){
        int left = 0 ; int right = nums.length-1;

        while(left<right){
            // find mid element
            int mid=left+(right-left)/2;
            // check if middle index element is unique.
            if((mid-1<0||nums[mid]!=nums[mid-1]) &&
                    (mid+1==nums.length||nums[mid]!=nums[mid+1])){
                return nums[mid];
            }

            // check if element is present at left
            int leftSize=nums[mid]==nums[mid-1]?mid-1:mid;

            // check which side is odd
            if(leftSize%2==0){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }

        return nums[left];
    }
}
