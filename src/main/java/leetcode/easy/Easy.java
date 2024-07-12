package leetcode.easy;

import java.util.List;

public interface Easy {
    /**
     * URL https://leetcode.com/problems/merge-strings-alternately/description/
     */
    String mergeAlternately(String word1, String word2);
    String mergeAlternatelyUsingTwoPointers(String word1,String word2);

    /**
     * url: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
     */
    List<Boolean> kidsWithCandies(int[] candies, int extraCandies);
    List<Boolean> kidsWithCandiesOptimised(int[] candies,int extraCandies);
}
