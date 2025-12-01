package leetcode;

public class _283_Move_Zeroes {
    // url: https://leetcode.com/problems/move-zeroes/description/
    public void moveZeroes(int[] nums) {
     int j =0; // last non zero index
        for (int i = 0; i < nums.length; i++) {
        if(nums[i]!=0){
            nums[j++]=nums[i];
        }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
