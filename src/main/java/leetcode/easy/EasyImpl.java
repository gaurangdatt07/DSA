package leetcode.easy;

import java.util.Objects;
import java.util.Stack;

public class EasyImpl implements Easy{
    @Override
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();

        int minLength = Math.min(word1.length(), word2.length());

        // Merge characters alternately from both strings
        while (i < minLength) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
            i++;
        }

        // Append the remaining part of the longer string
        if (i < word1.length()) {
            stringBuilder.append(word1.substring(i));
        }
        if (i < word2.length()) {
            stringBuilder.append(word2.substring(i));
        }

        return stringBuilder.toString();
    }

    @Override
    public String mergeAlternatelyUsingTwoPointers(String word1, String word2) {
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
