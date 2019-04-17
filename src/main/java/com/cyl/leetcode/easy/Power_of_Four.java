package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-16.
 */
public class Power_of_Four {
  public static void main(String args[]){
//    System.out.println(new Power_of_Four().isPowerOfFour(2));
    System.out.println(0x5&2);
  }
  public boolean isPowerOfFour(int num) {
    return (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
  }
}
