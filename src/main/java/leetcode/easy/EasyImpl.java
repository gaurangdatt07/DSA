package leetcode.easy;

import com.sun.source.tree.Tree;
import leetcode.ListNode;
import leetcode.TreeNode;

import java.util.*;

public class EasyImpl implements Easy{

    @Override
    public boolean containsDuplicate(int[] nums) {
        // create a hashset to store numbers that have been encountered.
        Set<Integer>occuredNums= new HashSet<>();

        // for each number in the array.
        for(Integer each:nums){

            // if the number is present in set then duplicate is true.
            if(occuredNums.contains(each)){
                return true;
            }

            // else add the number in set as encountered number.
            occuredNums.add(each);
        }

        // if no number is encountered then no duplicate is present.
        return false;
    }

    @Override
    public boolean isAnagram(String s, String t) {

        // if length of two string are not equal then return false.
        if(s.length()!=t.length()){
            return false;
        }

        // create new map two keep count of char and its occurance
        Map<Character,Integer>sMap=new HashMap<>();
        Map<Character,Integer>tMap=new HashMap<>();

        // traverse through both the strings.
        for(int i = 0 ; i <s.length();i++){

            // check if character is present in map then increase count
            char sChar = s.charAt(i);
            sMap.merge(sChar,1,Integer::sum);

            // check if character is present in map then increase count
            char tChar = t.charAt(i);
            tMap.merge(tChar,1,Integer::sum);
        }

        //for both maps..
        for(Character c:sMap.keySet()){
            // if counts are not equal then return false
            if(!sMap.get(c).equals(tMap.get(c))){
                return false;
            }
        }

        return true;
    }

    @Override
    public int[] twoSum(int[] nums, int target) {

        // create a map to store number to index
        Map<Integer,Integer>complimentMap=new HashMap<>();

        // for each number in arrays
        for(int i = 0 ; i < nums.length;i++){
            // get the compliment number.
            int balance=target-nums[i];
            //check if the map has the compliment number
            if(complimentMap.containsKey(balance)){
                // return array with index.
                return new int[]{complimentMap.get(balance),i};
            }
                // put the number in map if compliment is not found.
                complimentMap.put(nums[i],i);

        }

        // if no entry is found then return empty array.
        return new int[]{};
    }

    @Override
    public boolean isValid(String s) {
        // create a map of brackets
        HashMap<Character,Character>characterHashMap=new HashMap<>();
        characterHashMap.put('}','{');
        characterHashMap.put(')','(');
        characterHashMap.put(']','[');

        // create a stack
        Stack<Character>characterStack=new Stack<>();

        // traverse the string
        for(int i=0;i<s.length();i++){

            // get the character
            char c=s.charAt(i);

            // if the character is in the map
            if(characterHashMap.containsKey(c)){
                // and key value is not same as stack top element or if stack is empty return false.
                if(characterStack.isEmpty() || characterHashMap.get(c)!=characterStack.pop()){
                    return false;
                }

            }else{
                // push to stack
                characterStack.push(c);
            }
        }
        return characterStack.empty();
    }

    @Override
    public int maxProfit(int[] prices) {
        int left=0; // buying index
        int right=1; // selling index
        int maxProfit=0;

        // while selling index is less than size of array
        while(right<prices.length){

            // if buying price is less than selling price
            // profitable
            if(prices[left]<prices[right]){
                // calculate profit
                int profit= prices[right] - prices[left];
                //maxProfit update if profit is greater than maxProfit
                maxProfit= Math.max(maxProfit, profit);
            }else{
                // selling price is lower than buying price so update buying price as the selling price
                left=right;
            }
            right++;
        }
        return maxProfit;
    }

    @Override
    public TreeNode invertTree(TreeNode root) {
        // recursion break condition
        if(Objects.isNull(root)){
            return null;
        }
        // invert logic
        TreeNode tempNode= new TreeNode();
        tempNode=root.left;
        root.left=root.right;
        root.right=tempNode;

        // recursive call to visit each parent node and invert the childNodes
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    @Override
    public int maxDepth(TreeNode root) {
        // recursion break condition.
        if(Objects.isNull(root)){
            return 0;
        }

        // get the maximum count between the depth of two branches.
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
