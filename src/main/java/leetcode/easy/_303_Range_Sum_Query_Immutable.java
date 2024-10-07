package leetcode.easy;

public class _303_Range_Sum_Query_Immutable {

    // DECLARE ARRAY ON CLASS LEVEL
    int[] prefixSumArray;
    public _303_Range_Sum_Query_Immutable(int[] nums) {
        // CREATE PREFIX SUM ARRAY WHICH CONTAINS SUM OF ALL NUMBER BEFORE ith ELEMENT
        int length=nums.length;
        prefixSumArray=new int[length+1];
        prefixSumArray[0]=0;
        for(int i =0;i<nums.length;i++){
            prefixSumArray[i+1]=prefixSumArray[i]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSumArray[right+1]-prefixSumArray[left];
    }
}
