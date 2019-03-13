package com.cyl.leetcode.easy;

import java.util.*;

/**
 * Created by cang on 19-3-12.
 */
public class Best_Time_to_Buy_and_Sell_Stock {
  public static void main(String args[]){
    int [] prices = {7,1,5,3,6,4};
    System.out.println(new Best_Time_to_Buy_and_Sell_Stock().maxProfit(prices));
  }
  public int maxProfit(int[] prices) {
    if(prices.length<1) return 0;
    int lowest = Integer.MAX_VALUE;
    int maxp = Integer.MIN_VALUE;
    for(int i =0;i<prices.length;i++){
      lowest = Math.min(lowest,prices[i]);
      maxp = Math.max(maxp, prices[i]-lowest);
    }
    return maxp;
  }
}
