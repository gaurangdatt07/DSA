package leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * url: https://leetcode.com/problems/valid-parentheses/description/
 */
public class _20_Is_Valid_Parenthesis {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stackChar = new Stack<>();
        HashMap<Character,Character> charMap = new HashMap<>();
        charMap.put(')','(');
        charMap.put('}','{');
        charMap.put(']','[');
        for(Character c : charArray){
            if(c.equals('{')||c.equals('(')||c.equals('[')){
                stackChar.push(c);
            }else{
                if(!stackChar.isEmpty()&&charMap.get(c).equals(stackChar.peek())
                ){
                    stackChar.pop();
                }else {
                    return false;
                }
            }
        }
        return stackChar.isEmpty();
    }
}
