package leetcode.medium;

import java.util.Arrays;

public class _322_Coin_Change {

    public int coinChange(int[] coins, int amount) {
        // create an array
        int[] dpArray=new int[amount+1];
        Arrays.fill(dpArray,amount+1); // fill array with amount+1 since we are looking for minimum
        dpArray[0]=0;

        // for each i check if the amount can be stored ..
        for(int i =1;i<=amount;i++){
            for(int coin : coins){
                if(i-coin>=0){
                    dpArray[i]=Math.min(dpArray[i],dpArray[i-coin]+1);
                }
            }
        }


        //return coint
        return dpArray[amount]>amount?-1:dpArray[amount];
    }
}
