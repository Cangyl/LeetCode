package com.cyl.leetcode.easy;

import java.util.*;

/**
 * Created by cang on 19-4-18.
 */
public class Intersection_of_Two_Arrays_II {
  public static void main(String args[]){
    int
    System.out.println("Hello");
  }
  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer,Integer> integerMap =  new HashMap<Integer, Integer>();
    for(int i =0;i<nums1.length;i++){
      if(integerMap.keySet().contains(nums1[i])){
        integerMap.put(nums1[i],integerMap.get(nums1[i])+1);
      }else {
        integerMap.put(nums1[i],1);
      }
    }
    List<Integer> integerList = new ArrayList<Integer>();
    for(int i =0;i<nums2.length;i++){
      if(integerMap.keySet().contains(nums2[i])&&
          integerMap.get(nums2[i])>0){
        integerList.add(nums2[i]);
        integerMap.put(nums2[i],integerMap.get(nums2[i])-1);
      }
    }
    int [] results = new int[integerList.size()];
    int i=0;
    for(Integer element: integerList){
      results[i] = element;
      i++;
    }
    return results;
  }
}
