package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-2-26.
 */
public class Climbing_Stairs {
  public static void main(String args[]){
    System.out.println("hello world");
  }
  public int climbStairs(int n) {
    if(n <= 2)
      return n;

    int a = 1;
    int b = 2;

    for(int i = 3; i <= n; i++)
    {
      int sum = a + b;
      a = b;
      b = sum;
    }
    return b;
  }
}
