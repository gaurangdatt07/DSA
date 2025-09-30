package arraysandhashing;

import java.util.*;

/**
 * url: https://leetcode.com/problems/group-anagrams/
 */
public class _49_Group_Anagram {
    /**
     * time complexity: O(m*nlogn)
     * space complexity: O(m*n)
     * where m is the number of strings and n is the size of the largest string.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String string = arr.toString();
            map.putIfAbsent(string, new ArrayList<>());
            map.get(string).add(str);
        }

        return new ArrayList<>(map.values());
    }


    /**
     * timeComplexity: O(m*n)
     * space Complexity: O(m*n)
     */
    public List<List<String>> groupAnagramsOptimised(String[] strs) {
        Character[] arr = new Character[26];
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            for(char c : charArray) {
                arr[c - 'a']++;
            }
            String string = charArray.toString();
            map.putIfAbsent(string, new ArrayList<>());
            map.get(string).add(str);
        }

        return new ArrayList<>(map.values());
    }


}
