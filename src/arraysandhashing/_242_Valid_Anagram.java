package arraysandhashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * url: https://leetcode.com/problems/valid-anagram/
 */
public class _242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        for(Character key : sMap.keySet()){
            if (!Objects.equals(sMap.get(key), tMap.get(key))) return false;
        }
        return true;
    }
}
