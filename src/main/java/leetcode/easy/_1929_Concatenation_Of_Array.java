package leetcode.easy;

import java.util.HashMap;

public class _1929_Concatenation_Of_Array {

    /**
     * url: https://leetcode.com/problems/concatenation-of-array/description/
     * @param nums
     * @return
     */
    public int[] getConcatenation(int[] nums) {

        int[] newArray = new int[2*nums.length];

        for(int i = 0 ; i <nums.length;i++){
            newArray[i]=nums[i];
            newArray[nums.length+i]=nums[i];
        }

        return newArray;
    }
}
