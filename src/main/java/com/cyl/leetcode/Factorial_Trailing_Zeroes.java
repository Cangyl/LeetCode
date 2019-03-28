package com.cyl.leetcode;

/**
 * Created by cang on 19-3-25.
 */
public class Factorial_Trailing_Zeroes {
  public static void main(String args[]){
    System.out.println(new Factorial_Trailing_Zeroes().trailingZeroes(30));
  }
  public int trailingZeroes(int n) {
    int result = 0;
    while(n>0){
      n = n/5;
      result += n;
    }
    return result;
  }
  private int number_oushu(int n){
    return n/2;
  }
  private int number_five(int n){
    return n/5;
  }
}
