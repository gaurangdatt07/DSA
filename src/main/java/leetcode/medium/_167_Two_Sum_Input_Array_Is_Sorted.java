package leetcode.medium;

public class _167_Two_Sum_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {

        // DECLARE TWO POINTERS LEFT AND RIGHT
        int leftPointer= 0, rightPointer=numbers.length-1;

        // RUN WHILE LEFT POINTER HAS NOT CROSSED RIGHT POINTER
        while(leftPointer<rightPointer){
            // CHECK IF SUM IS EQUAL TO TARGET
            int sum = numbers[leftPointer] + numbers[rightPointer];
            if(sum==target){
                // IF YES THEN RETURN LEFT AND RIGHT POINTER
                return new int[]{++leftPointer,++rightPointer};
            }
            if(sum>target){
                // IF SUM IS GREATER THAN REDUCE RIGHT POINTER
                // SINCE TARGET IS GETTING EXCEEDED
                rightPointer--;
            } else {

                // ELSE SUM IS SMALLER THAN TARGET THAN MOVE RIGHT POINTER
                // SINCE TARGET IS NOT GETTING MET NEED TO INCREASE NUMBER
                leftPointer++;
            }
        }

        return new int[]{};
    }
}
