package leetcode.easy;

/**
 * url: https://leetcode.com/problems/remove-element/
 */
public class _27_Remove_element {
    public int removeElement(int[] nums, int val) {
        int j = 0 ;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
