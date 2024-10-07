package leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _416_Partition_Equal_Subset_Sum {
    public boolean canPartition(int[] nums){

        // for equal partition the sum has to be even
        int sum = Arrays.stream(nums)
                .sum();
        if(sum%2!=0){
            return false;
        }

        // create one set to store the sum of all the numbers occuring in subset
        Set<Integer> dp=new HashSet<>();
        dp.add(0);

        // if this target is achieved while adding in subset then partition is available
        int target=sum/2;

        //iterate the list and add nums[i] with all the numbers
        // present in the dp set and store the number in dp set
        for(int i = nums.length-1;i>-1;i--){
            Set<Integer>tempSet=new HashSet<>();
            for(int t:dp){
                tempSet.add(t+nums[i]);
                tempSet.add(t);
            }
            dp=tempSet;
        }

        // if target is in dp set that means subset can be achieved.
        return dp.contains(target);
    }
}
