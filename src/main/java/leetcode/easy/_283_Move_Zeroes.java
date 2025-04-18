package leetcode.easy;

public class _283_Move_Zeroes {

    // https://leetcode.com/problems/move-zeroes/
    public void moveZeroes(int[] nums) {
        int nonZeroElementIndex=0;
        for(int i = 0 ; i < nums.length;i++){
            // if current element is non zero
            // move it to nonZeroelement index
            // and increment that index.
            if(nums[i]!=0){
                nums[nonZeroElementIndex]=nums[i];
                nonZeroElementIndex++;
            }
        }

        // fill the remaining array as 0
        for(int i = nonZeroElementIndex;i <nums.length;i++){
            nums[i]=0;
        }
    }
}
