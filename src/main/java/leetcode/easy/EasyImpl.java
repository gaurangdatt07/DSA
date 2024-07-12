package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
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

    @Override
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>booleans=new ArrayList<>();
        for (int j : candies) {
            boolean flag = true;
            int totalCandies = j + extraCandies;
            for (int candy : candies) {
                if (totalCandies < candy) {
                    flag = false;
                    break;
                }
            }
            booleans.add(flag);
        }
        return booleans;
    }

    @Override
    public List<Boolean> kidsWithCandiesOptimised(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
