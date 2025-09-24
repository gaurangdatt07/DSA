package stack;


import java.util.Objects;
import java.util.Stack;

/**
 * url : https://leetcode.com/problems/crawler-log-folder/
 */

// TODO: time comlexity O(n) and space complexity O(n)
public class _1598_Crawler_Log_Folder {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
       for(String log:logs){
           if(Objects.equals(log, "./")){
               continue;
           }else if(Objects.equals(log, "../")){
               if(stack.isEmpty()){
                   continue;
               }
               stack.pop();
           }else{
               stack.push(log);
           }
       }
        return stack.size();
    }


    // TODO: optimised solution O(1) space complexity
    public int minOperationsOptimised(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            switch (log) {
                case "../":
                    if (depth > 0) depth--;
                    break;
                case "./":
                    break;
                default:
                    depth++;
            }
        }
        return depth;
    }
}
