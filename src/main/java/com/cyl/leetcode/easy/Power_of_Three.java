package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-15.
 */
public class Power_of_Three {
  public static void main(String args[]){
    System.out.println(new Power_of_Three().isPowerOfThree(24));
  }
  public boolean isPowerOfThree(int n) {
    if(n==0)return false;
    while(n!=1){
      if(n%3==0){
        n /=3;
      }else {
        return false;
      }
    }
    return true;
  }
}
