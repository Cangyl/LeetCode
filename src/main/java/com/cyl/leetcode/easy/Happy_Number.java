package com.cyl.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by cang on 19-3-28.
 */
public class Happy_Number {
  public static void main(String args[]){
    System.out.println(new Happy_Number().isHappy(1));
    System.out.println(new Happy_Number().isHappy(19));
    System.out.println(new Happy_Number().isHappy(2));
  }
  public boolean isHappy(int n) {
    if(n==1) return true;
    Set<Integer> integers = new HashSet<Integer>();
    while(n!=1){
      n = calculat_happy(n);
      if(integers.contains(n)){
        return false;
      }else {
        integers.add(n);
      }
    }
    return true;
  }
  private int calculat_happy(int n){
    int result = 0;
    while(n>0){
      int element = n%10;
      result += Math.pow(element,2);
      n /=10;
    }
    return result;
  }
}
