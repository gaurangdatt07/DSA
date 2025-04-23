package leetcode.arraysHashingString.easy.medium;

import java.util.HashMap;

public class _1679_Max_Number_Of_K_Sum_Pair {
    // https://leetcode.com/problems/max-number-of-k-sum-pairs/
    public int maxOperations(int[] nums, int k) {
        // have a compliment map to store frequency of each number.
        HashMap<Integer,Integer> numFrequencyMap = new HashMap<>();

        // have total operation count.
        int count = 0 ;
        for (int num : nums) {
            int compliment = k - num;
            if (numFrequencyMap.containsKey(compliment)) {
                count++;
                numFrequencyMap.put(compliment, numFrequencyMap.get(compliment) - 1);
            } else {
                numFrequencyMap.put(num, numFrequencyMap.getOrDefault(num,0)+1);
            }
        }
        return count;
    }
}
