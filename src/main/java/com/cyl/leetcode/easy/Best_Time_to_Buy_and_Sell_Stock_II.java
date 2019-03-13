package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-13.
 */
public class Best_Time_to_Buy_and_Sell_Stock_II {
  public static void main(String args[]){
    int [] prices = {7,1,5,3,6,4};
//    int [] prices = {1,2,3,4,5};
    System.out.println(new Best_Time_to_Buy_and_Sell_Stock_II().maxProfit(prices));
  }
  public int maxProfit(int[] prices) {
    if(prices.length<2) return 0;
    int accumulate = 0;
    for(int i = prices.length-1;i>0;i--){
      if(prices[i]>prices[i-1]){
        accumulate += (prices[i]-prices[i-1]);
      }
    }
    return accumulate;
  }
}
