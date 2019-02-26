package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-2-23.
 */
public class Maximum_Subarray {
  public static void main(String args[]){
    int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(new Maximum_Subarray().maxSubArray(nums));
  }
  public int maxSubArray(int[] nums) {
    if(nums.length ==0) return 0;
    int sum = Integer.MIN_VALUE;
    int maxSum = Integer.MIN_VALUE;
    for(int n : nums){
      sum = Math.max(sum+n, n);
      maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
  }
}
