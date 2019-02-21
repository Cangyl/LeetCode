package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-2-19.
 */
public class Remove_Duplicates_from_Sorted_Array {
  public static void main(String args[]){
    int [] array ={1,1,2,2,3};
    System.out.println(new Remove_Duplicates_from_Sorted_Array().removeDuplicates(array));
  }
  public int removeDuplicates(int[] nums) {
    if(nums.length==0) return 0;
    int element = nums[0];
    int j = 1;
    int i = 1;
    while(i<nums.length){
      while(j<nums.length&&element == nums[j]){
        j++;
      }
        if(j<nums.length){
          nums[i] = nums[j];
          i++;
          element = nums[j];
        }else {
          return i;
        }
    }
    return nums.length;
  }
}
