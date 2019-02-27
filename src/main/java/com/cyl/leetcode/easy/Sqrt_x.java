package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-2-26.
 */
public class Sqrt_x {
  public static void main(String args []){
    System.out.println(new Sqrt_x().mySqrt(2147395599));
  }
  public int mySqrt(int x) {
    if (x <= 1) {
      return x;
    }

    int left = 1, right = x,result =1;
    while (left <= right) {
      int mid = (left+right)/2;
      if(mid<x/mid){
        left = mid+1;
        result = mid;
      }else {
        right = mid-1;
      }
    }
    return result;
  }
}
