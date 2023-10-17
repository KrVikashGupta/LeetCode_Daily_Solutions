/* 121 Leetcode 
 Problem Decription 
 You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


Solution */

class Solution {
    public int maxProfit(int[] prices) {

         // Step 1: Initialize variables
        int buyPrice = Integer.MAX_VALUE;  // Initialize buyPrice to a large value
        int maxProfit = 0;  // Initialize maxProfit to 0
        
        // Step 2: Iterate through the prices array
        for(int i=0; i<prices.length;i++) {
            // Step 3: If the current price is lower than the buyPrice, update buyPrice
            if(buyPrice < prices[i]) {
                
                // Step 4: If the current price is higher, calculate profit and update maxProfit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
            else {
                buyPrice = prices[i];
            }
        }
      // Step 5: Return the maximum profit
      return maxProfit;
    }
}


/*
Time Complexity:  O(n)
Space Complexity: O(1)
*/
