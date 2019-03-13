package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-13.
 */
public class Single_Number {
  public static void main(String args[]){
    int [] nums = {4,1,2,1,2};
    System.out.println(2^4);
  }
  public int singleNumber(int[] nums) {
    for(int i =0;i<nums.length;i++){
      int j =0;
      for( j =0;j<nums.length;j++){
        if(i==j)continue;
        if(nums[i]==nums[j])
          break;
      }
      if(j==nums.length){
        return nums[i];
      }
    }
    return -1;
  }
}
