package stack;

import java.util.Stack;

/**
 * url: https://leetcode.com/problems/baseball-game/
 */
public class _682_Baseball_Game {

    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        for(String op:operations){
            switch (op){
                case "+":
                    Integer popped = stack.pop();
                    int newNumber = stack.peek() + popped;
                    stack.push(popped);
                    stack.push(newNumber);
                    break;
                    case "D":
                        stack.push(stack.peek()*2);
                        break;
                        case "C":
                            if(!stack.isEmpty()){
                                stack.pop();
                            }
                            break;
                default:
                        stack.push(Integer.parseInt(op));
                        break;
            }
        }
        int num = 0;
        while(!stack.isEmpty()){
            num += stack.pop();
        }
        return num;
    }
}
