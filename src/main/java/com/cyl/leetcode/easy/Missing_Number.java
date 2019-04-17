package com.cyl.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by cang on 19-4-11.
 */
public class Missing_Number {
  public static void main(String args[]){
    System.out.println("Hello world");
  }
  public int missingNumber(int[] nums) {
    Set<Integer> integers = new HashSet<Integer>();
    for(int i =0;i<nums.length;i++){
      integers.add(nums[i]);
    }
    for(int i =0;i<=nums.length;i++){
      if(!integers.contains(i))
        return i;
    }
    return -1;
  }
//  public int missingNumber(int[] nums) {
//    int len = nums.length;
//    int tot = len*(len+1)/2;
//    for (int i = 0; i<len; i++){
//      tot -= nums[i];
//    }
//    return tot;
//  }
}
