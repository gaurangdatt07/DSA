package leetcode.io.neetcode.arrays_hashing.easy;

import java.util.HashMap;
import java.util.Objects;

/**
 * Given two strings s and t, return true if t is an
 * anagram
 *  of s, and false otherwise.
 */
public class _242_Valid_Anagram {

    public boolean isAnagram(String s, String t) {

        // if lengths are uneven return false
        // since it can not be anagram
        if(s.length()!=t.length()){return false;}

        // create two maps for s and t string
        HashMap<Character,Integer>sMap=new HashMap<>();
        HashMap<Character,Integer>tMap=new HashMap<>();

        // traverse through both strings at same time
        for(int i =0 ; i <s.length();i++){

            // create two variable to keep character count.
            int sCount=0,tCount=0;

            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // for each character in both string increase the count of occurance
            // of that character
            if(sMap.containsKey(charS)){
                sCount = sMap.get(charS);
            }
            sMap.put(charS,++sCount);

            if(tMap.containsKey(charT)){
                tCount=tMap.get(charT);
            }
            tMap.put(charT,++tCount);
        }

        // for the map created
        for(Character chars:sMap.keySet()){

            // if both keys don't have same length return false
            // not anagram
            if(!Objects.equals(sMap.get(chars), tMap.get(chars))){return false;}
        }

        return true;
    }
}
