package leetcode.easy;

/**
 * https://leetcode.com/problems/merge-strings-alternately/
 */
public class _1768_Merge_Strings_Alternately {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        StringBuilder stringBuilder=new StringBuilder();
        while(i<word1.length()||j<word2.length()){
            if(i<word1.length()){
                stringBuilder.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                stringBuilder.append(word2.charAt(j));
                j++;
            }
        }

        return stringBuilder.toString();
    }
}
