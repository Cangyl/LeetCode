package com.cyl.leetcode.easy;

import java.util.*;

/**
 * Created by cang on 19-5-10.
 */
public class Third_Maximum_Number {
  public static void main(String args[]){
    int [] nums ={1,2,2,5,3,5};
    System.out.println(new Third_Maximum_Number().thirdMax(nums));

  }
  public int thirdMax(int[] nums) {
    Set<Integer> threeElement = new TreeSet<Integer>();
    for(int i =0;i<nums.length;i++){
      threeElement.add(nums[i]);
      if(threeElement.size()>3){
        threeElement.remove(Collections.min(threeElement));
      }
    }
    if(threeElement.size()>=3){
      return Collections.min(threeElement);
    }else {
      return Collections.max(threeElement);
    }
  }
}
