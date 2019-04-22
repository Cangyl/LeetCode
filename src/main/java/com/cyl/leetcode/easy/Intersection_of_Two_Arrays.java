package com.cyl.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by cang on 19-4-17.
 */
public class Intersection_of_Two_Arrays {
  public static void main(String args[]){

  }
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> integers = new HashSet<Integer>();
    for(int i =0;i<nums1.length;i++){
      for(int j =0;j<nums2.length;j++){
        if(nums2[j] == nums1[i]){
          integers.add(nums1[i]);
          break;
        }
      }
    }
    int [] results = new int[integers.size()];
    int i=0;
    for(Integer element: integers){
      results[i] = element;
      i++;
    }
    return results;
  }
}
