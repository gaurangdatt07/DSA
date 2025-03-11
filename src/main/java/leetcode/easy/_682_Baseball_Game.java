package leetcode.easy;

import java.util.Stack;

/**
 * url: https://leetcode.com/problems/baseball-game/
 */
public class _682_Baseball_Game {
    public int calPoints(String[] operations) {
        Stack<Integer>score=new Stack<>();

        for(String operation:operations){
            if(operation.equals("C")){
                score.pop();
            }
            else if(operation.equals("D")){
                Integer element = score.peek();
                score.push(element*2);
            }
            else if(operation.equals("+")){
                Integer firstElement = score.pop();
                Integer secondElement = score.pop();
                score.push(secondElement);
                score.push(firstElement);
                score.push(secondElement+firstElement);
            }else{
                score.push(Integer.parseInt(operation));
            }
        }
        if(score.isEmpty()){
            return 0;
        }
        int finalScore=0;
        while(!score.isEmpty()){
            finalScore+=score.pop();
        }

        return finalScore;
    }
}
