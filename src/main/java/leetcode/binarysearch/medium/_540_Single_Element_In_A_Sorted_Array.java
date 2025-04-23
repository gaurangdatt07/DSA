package leetcode.binarysearch.medium;

public class _540_Single_Element_In_A_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {

        int left = 0 ; int right =nums.length;
        while(left<right){
            // fetch the middle point of array
            int mid = left+ (right-left)/2;
            // check mid element is unique ?
            if((mid-1<0 || (nums[mid]!= nums[mid-1]))
                    &&
                    (mid+1==nums.length||nums[mid]!=nums[mid+1])){
                // if yes this is the single element;
                return nums[mid];
            }
            // check left size
            // if element is at left then size will be mid-1 else mid;
            int leftSize = nums[mid]==nums[mid-1]?mid-1:mid;

            // if mid size is even element is in right subarray
            if(leftSize%2==0){
                left=mid+1;
            }
            // else it is left sub array
            else{
                right=mid-1;
            }
        }

        // if element is not in loop then it has to be the leftmost element
        return nums[left];

    }
}
