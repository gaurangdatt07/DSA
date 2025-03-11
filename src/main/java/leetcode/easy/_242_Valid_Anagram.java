package leetcode.easy;

import java.util.HashMap;
import java.util.Objects;

public class _242_Valid_Anagram {
    /**
     * url:https://leetcode.com/problems/valid-anagram/
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer>tMapFrequency=new HashMap<>();
        HashMap<Character,Integer>sMapFrequency=new HashMap<>();

        for(int i = 0 ;i<s.length();i++){
            Integer sFrequency = sMapFrequency.getOrDefault(s.charAt(i), 0);
            sMapFrequency.put(s.charAt(i),++sFrequency);

            Integer tFrequency = tMapFrequency.getOrDefault(t.charAt(i), 0);
            tMapFrequency.put(t.charAt(i),++tFrequency);
        }

        for(Character key:sMapFrequency.keySet()){
            if(!Objects.equals(sMapFrequency.get(key), tMapFrequency.get(key))){
                return false;
            }
        }
        return true;
    }
}
