package leetcode.easy;

public class _1399_Count_Largest_Group {
    // https://leetcode.com/problems/count-largest-group/description/

    public int countLargestGroup(int n) {

        // to store frequency count of sum of digits
        int[] frequencyArray = new int[40];

        // maxCount and maxSize
        int maxCount=0;
        int maxSize=0;
        for(int i = 1;i<=n;i++){
            // create sum of digit
            int sumOfDigit=createSumOfDigit(i);
            // increase count of frequencyMap of that particular index.
            ++frequencyArray[sumOfDigit];

            // if maxSize is smaller than current arraycount
            // make the count as maxSize and make maxCount=1
            if(maxSize<frequencyArray[sumOfDigit]){
                maxSize=frequencyArray[sumOfDigit];
                maxCount=1;
            }else if (maxSize==frequencyArray[sumOfDigit]){
                maxCount++; // else if same increase maxCount (keys with same frequency)
            }
        }

        // return maxCount
        return maxCount;

    }

    private int createSumOfDigit(int digit) {
        // sumOfDigits
        int sumOfDigits=0;
        while (digit >0){
            int reminder= digit %10;
            sumOfDigits+=reminder;
            digit = digit /10;
        }
        return sumOfDigits;
    }
}
