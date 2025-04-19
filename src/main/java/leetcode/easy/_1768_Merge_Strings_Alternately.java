package leetcode.easy;

public class _1768_Merge_Strings_Alternately {

    // https://leetcode.com/problems/merge-strings-alternately/
    public String mergeAlternately(String word1, String word2) {
        // get minimum of both strings
        int loopSize = Math.min(word1.length(),word2.length());
        StringBuilder sb = new StringBuilder();

        //in loop keep appending in stringbuilder alternately.
        for(int i =0 ;i < loopSize;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        // Append the remaining part of the longer string
        if (word1.length() > word2.length()) {
            sb.append(word1.substring(loopSize));
        } else {
            sb.append(word2.substring(loopSize));
        }

        // return string
        return sb.toString();
    }

}
