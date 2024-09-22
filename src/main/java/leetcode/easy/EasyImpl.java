package leetcode.easy;

import com.sun.source.tree.Tree;
import leetcode.ListNode;
import leetcode.TreeNode;

import java.util.*;

public class EasyImpl implements Easy{

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
