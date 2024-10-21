package leetcode.io.neetcode.slidingWindow.easy;

public class _121_Best_Time_To_Buy_And_Sell_Stock {
    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     */
    public int maxProfit(int[] prices) {
        // create two index and max profit
        int buy=0,sell=1,maxProfit=0;

        // while both buy and sell index are less than array
       while(buy<prices.length&&sell<prices.length){

           // calculate profit of buy and sell index
           int profit = prices[sell] - prices[buy];

           //if profit is greater than max profit then make it as maxprofit
           if(profit>maxProfit){
               maxProfit=profit;
               // if buy price is higher than sell price then make buy index as sell index
           } else if (prices[buy]>prices[sell]){
                    buy=sell;
           }

           // move index to next.
           sell++;
       }

       //return max profit
       return maxProfit;
    }
}
