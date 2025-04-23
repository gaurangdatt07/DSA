package leetcode.arraysHashingString.easy.medium;

public class _334_Increasing_Triplet_Subsequences {
    // https://leetcode.com/problems/increasing-triplet-subsequence/

    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second= Integer.MAX_VALUE;

        //The goal is to find three numbers in order such that:
        //first < second < num (current number)
        for(Integer num : nums){
            if(num<=first){
                first=num;
            }else if(num<=second){
                second=num;
            }else {
                return true;
            }
        }

        return false;
    }
}
