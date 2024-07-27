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

    /**
     https://neetcode.io/problems/duplicate-integer
     */
    boolean hasDuplicate(int[] nums);

    /**
     * https://neetcode.io/problems/two-integer-sum
     */
    int[] twoSum(int[] nums, int target);
    int[] twoSumUsingHashMap(int[] nums, int target);

    /**
     * https://leetcode.com/problems/valid-anagram/description/
     */
    boolean isAnagram(String s, String t);
    boolean isAnagramUsingSingleMap(String s, String t);

    /**
     * https://leetcode.com/problems/valid-palindrome/description/
     * @param s
     * @return
     */
    boolean isPalindrome(String s);



}
