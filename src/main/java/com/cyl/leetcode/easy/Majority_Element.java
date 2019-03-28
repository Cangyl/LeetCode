package com.cyl.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
  public static void main(String args[]){
    int [] nums = {1,1,0,1,1,0,1,0,0,0,0};
    System.out.println(new Majority_Element().majorityElement(nums));
  }
//  public int majorityElement(int[] nums) {
//    Arrays.sort(nums);
//    return nums[nums.length/2];
//  }
//public int majorityElement(int[] nums) {
//  if(nums.length==1)return nums[0];
//  Map<Integer,Integer> integerMap = new HashMap<Integer, Integer>();
//  for(int i =0; i<nums.length; i++){
//    if(integerMap.keySet().contains(nums[i])){
//      int acc = integerMap.get(nums[i]);
//      acc++;
//      if(acc>nums.length/2){
//        return nums[i];
//      }
//      integerMap.put(nums[i],acc);
//    }else {
//      integerMap.put(nums[i],1);
//    }
//  }
//  return 0;
//}
  //多数投票算法(Boyer-Moore Algorithm)详解
  public int majorityElement(int[] nums) {
    int candidate = nums[0];
    int count = 1;
    for(int i = 1;i<nums.length;i++){
      if(nums[i]==candidate){
        count++;
      }else {
        if(count ==0 ){
          candidate = nums[i];
          count++;
        }
        count --;
      }
    }
    return candidate;
  }
}
