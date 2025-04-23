package leetcode.binarysearch.medium;

public class _162_Find_Peak_element {

    // https://leetcode.com/problems/find-peak-element/description/

    public int findPeakElement(int[] nums) {
        int left = 0 ; int right=nums.length-1;
        // go in a loop
        while (left<right){
            // check mid
            int mid = left+(right-left)/2;

            //  check  mid-1
            if(mid>0&&nums[mid]<nums[mid-1]){
                right=mid-1;
            }
            // check mid+1
            else if (nums[mid]<nums[mid+1]){
                left=mid+1;
            }
            else{
                //  it is a peak
                return mid;
            }
        }

        return left;
    }
}
