package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-27.
 */
public class House_Robber {
  public static void main(String args[]){
    int [] nums = {1,2,3,1};
    int [] nums1 = {2,7,9,3,1};
    int [] nums2 = {2,7,9,11,13,15,19,21,23,25};
    int [] nums3 = {2,1,1,2};
//    System.out.println(new House_Robber().rob(nums));
//    System.out.println(new House_Robber().rob(nums1));
//    System.out.println(new House_Robber().rob(nums2));
    System.out.println(new House_Robber().rob(nums3));
  }
  public int rob(int[] nums) {
    if(nums.length==0)return 0;
    if(nums.length ==1) return nums[0];
    if(nums.length >=2){
      nums[1] = Math.max(nums[1],nums[0]);
    }
    for(int i = 2;i<nums.length;i++){
      int a_rob = nums[i-2]+nums[i];
      int b_rob = nums[i-1];
      nums[i] = Math.max(a_rob,b_rob);
    }
    return nums[nums.length-1];
  }
}
