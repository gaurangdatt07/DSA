package leetcode.arraysHashingString.easy;

import java.util.ArrayList;
import java.util.List;

public class _1431_Kids_With_Greatest_Number_Of_Candies {
    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //list to store isMax candy
        List<Boolean>isMaxCandy=new ArrayList<>();
        int maxCandy=Integer.MIN_VALUE;
        // in first pass gather the maxCandy from the array
        for(Integer candy :candies){
            maxCandy=Math.max(maxCandy,candy);
        }

        // in second pass check if candy+extraCandy will be greater than maxCandy
        for(Integer candy :candies){
            isMaxCandy.add(candy+extraCandies>=maxCandy);
        }
        return isMaxCandy;
    }
}
