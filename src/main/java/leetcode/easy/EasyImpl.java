package leetcode.easy;

import java.util.*;

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

    @Override
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int each:nums){
            if(seen.contains(each)){
                return true;
            }
            seen.add(each);
        }
        return false;
    }

    @Override
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    @Override
    public int[] twoSumUsingHashMap(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    @Override
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>sMap=new HashMap<>();
        Map<Character,Integer>tMap=new HashMap<>();
        for(int i = 0 ; i <s.length();i++){
            char sChar = s.charAt(i);
            sMap.merge(sChar,1,Integer::sum);

            char tChar = t.charAt(i);
            tMap.merge(tChar,1,Integer::sum);
        }

        for(Character c:sMap.keySet()){
            if(!sMap.get(c).equals(tMap.get(c))){
                return false;
            }
        }
        return true;
    }


    public boolean isAnagramUsingSingleMap(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>charCount=new HashMap<>();
        for(int i = 0 ; i <s.length();i++){
            char sChar = s.charAt(i);
            charCount.merge(sChar,1,Integer::sum);

            char tChar = t.charAt(i);
            charCount.merge(tChar,-1,Integer::sum);
        }

        for(Character c:charCount.keySet()){
            if(charCount.get(c)!=0){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while (left<right&&!Character.isLetterOrDigit(charArray[left])){
                left++;
            }

            while (left<right&&!Character.isLetterOrDigit(charArray[right])){
                right--;
            }
            if(Character.toLowerCase(charArray[left])!=Character.toLowerCase(charArray[right])){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }


}
