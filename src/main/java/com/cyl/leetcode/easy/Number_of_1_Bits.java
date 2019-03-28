package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-27.
 */
public class Number_of_1_Bits {
  public static void main(String args[]){
    System.out.println(new Number_of_1_Bits().hammingWeight(-3));
  }
  public int hammingWeight(int n) {
    int count = 0;
    while(n!=0){
      if((n&1) ==1 ){
        count++;
      }
      n = n>>>1;
    }
    return count;
  }
}
