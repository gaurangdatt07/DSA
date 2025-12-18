package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _242_Valid_Anagram {
    /**
     * url: https://leetcode.com/problems/valid-anagram/
     */
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // craete a frequency map
        Map<Character,Integer> frequencyMap=new HashMap<>();
        //count frequency of each character in string s and increment value
        char[] charArray = s.toCharArray();
        for(int i = 0 ; i < s.length();i++){
            frequencyMap.put(charArray[i],frequencyMap.getOrDefault(charArray[i],0)+1);
        }

        // now count frequency of character in t string.
        // if element is not present in map return false
        char[] charArray1= t.toCharArray();
        for(int i = 0 ; i < charArray1.length;i++){
            if(!frequencyMap.containsKey(charArray1[i])){
                return false;
            }
            frequencyMap.put(charArray1[i],frequencyMap.get(charArray1[i])-1);
        }

        // now iterate map if for any map value is less than 0 return false.
        for(Integer value:frequencyMap.values()){
            if(value<0){
                return false;
            }
        }
        return true;
    }
}
