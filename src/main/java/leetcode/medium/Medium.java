package leetcode.medium;

import leetcode.ListNode;

import java.util.List;

public interface Medium {
    /**
     * url : https://leetcode.com/problems/removing-stars-from-a-string/description/
     */
    String removeStars(String s);

    /**
     *
     * url: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
     */
    ListNode deleteMiddle(ListNode head);

    /**
     * url: https://leetcode.com/problems/asteroid-collision/description
     */
    int[] asteroidCollision(int[] asteroids);

    /**
     * https://leetcode.com/problems/group-anagrams/description/
     */
    List<List<String>> groupAnagrams(String[] strs);

    /**
     * https://leetcode.com/problems/top-k-frequent-elements/description/
     */
    int[] topKFrequent(int[] nums, int k);

    /**
     * https://leetcode.com/problems/encode-and-decode-strings/description/
     * https://neetcode.io/problems/string-encode-and-decode
     */
    String encode(List<String> strs);
    List<String> decode(String str);

    /**
     * https://leetcode.com/problems/product-of-array-except-self/description/
     */
    int[] productExceptSelf(int[] nums);

    /**
     * https://leetcode.com/problems/valid-sudoku/
     */
    boolean isValidSudoku(char[][] board);


    /**
     * https://leetcode.com/problems/longest-consecutive-sequence/
     * @param nums
     * @return
     */
    int longestConsecutive(int[] nums);


    /**
     * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
     */
    int[] twoSum(int[] numbers, int target);

    List<List<Integer>> threeSum(int[] nums);

    /**
     * https://leetcode.com/problems/min-stack/description/
     */
     void MinStack();
}
