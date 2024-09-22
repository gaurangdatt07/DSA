package leetcode.medium;

import leetcode.ListNode;
import leetcode.TreeNode;

import java.util.*;

public class MediumImpl implements Medium{
    @Override
    public int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        int i = 0; // Start of the window
        Set<Character> encounteredCharacters = new HashSet<>();

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            // If the character is already in the set, slide the window from the start (i)
            while (encounteredCharacters.contains(c)) {
                encounteredCharacters.remove(s.charAt(i));
                i++;
            }

            // Add the character to the set and calculate the max length
            encounteredCharacters.add(c);
            maxCount = Math.max(maxCount, j - i + 1);
        }

        return maxCount;
    }

}
