package com.cyl.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by cang on 19-4-1.
 */
public class Contains_Duplicate_II {
  public static void main(String args[]){
    System.out.println(3^2);
  }
//  public boolean containsNearbyDuplicate(int[] nums, int k) {
//    Set<Integer> set = new HashSet<Integer>();
//    for(int i = 0; i < nums.length; i++){
//      if(i > k) set.remove(nums[i-k-1]);
//      if(!set.add(nums[i])) return true;
//    }
//    return false;
//  }
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer,Integer> integerMap = new HashMap<Integer,Integer>();
    for(int i = 0;i<nums.length;i++){
      if(integerMap.keySet().contains(nums[i])){
        int dif = i - integerMap.get(nums[i]);
        if(dif<=k){
          return true;
        }else {
          integerMap.put(nums[i],i);
        }
      }else {
        integerMap.put(nums[i],i);
      }
    }
    return false;
  }
}
