package leetcode.medium;

import java.util.Arrays;

public class _300_Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        //create a cache array to store the longest increasing subsequence till index [i]
        int[] dp= new int[nums.length];
        // fill the cache array as 1 since there will at least be 1 longest subsequence
        // i.e the number itself
        Arrays.fill(dp,1);

        // start from last and start checking for longest subsequence using another loop
        for(int i =nums.length-1;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }


        // return the longest increasing subsequence.
        return Arrays.stream(dp).max().getAsInt();
    }
}
