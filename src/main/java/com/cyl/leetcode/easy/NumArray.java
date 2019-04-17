package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-15.
 */
public class NumArray {
  public static void main(String args[]){
    int [] nums = {1,2,3,4,5,6,7,8,9};
    NumArray obj = new NumArray(nums);
    System.out.println(obj.sumRange(0,2));
  }
  int [] sums = {};
  public NumArray(int[] nums) {
    if(nums.length == 0){
      return;
    }
    int []sums = new int[nums.length];
    sums[0]=nums[0];
    for(int i =1;i<nums.length;i++){
      sums[i] = sums[i-1] + nums[i];
    }
    this.sums = sums;
  }

  public int sumRange(int i, int j) {
    if(sums.length == 0)return 0;
    if(i==0){
      return sums[j];
    }
    return sums[j]-sums[i-1];
  }
}
