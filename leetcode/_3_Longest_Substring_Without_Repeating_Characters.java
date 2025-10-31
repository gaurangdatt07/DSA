package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _3_Longest_Substring_Without_Repeating_Characters {
    //URL :- https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int left = 0;
        for (int i = 0; i < charArray.length; i++) {

            while(set.contains(charArray[i])) {
                set.remove(charArray[left]);
                left++;
            }

            set.add(charArray[i]);
            maxLength = Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
}
