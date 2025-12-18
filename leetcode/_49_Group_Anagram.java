package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49_Group_Anagram {
    /**
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramStringsMap= new HashMap<>();
        for(String s : strs) {
            // create am array of 26 elements to store the frequency of each character in string.
            int[] countArray = new int[26];
            char[] charArray = s.toCharArray();

            for(Character c: charArray){
                // increase frequency of the array based on asci index subtraction.
                countArray[c-'a']++;
            }
            // create a string builder which creates a string of frequency of each character followed by hash
            StringBuilder stringBuilder=new StringBuilder();
            for(int i = 0 ; i< 26;i++){
                stringBuilder.append(countArray[i]).append("#");
            }

            // now check if the same hashedString exists in map and add it to the map
            List<String> stringList = anagramStringsMap.getOrDefault(stringBuilder.toString(), new ArrayList<>());
            stringList.add(s);
            anagramStringsMap.put(stringBuilder.toString(),stringList);
        }

        // returned all the map values which are nothing but grouped anagrams.
        return anagramStringsMap.values().stream().toList();
    }
}
