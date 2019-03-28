package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-27.
 */
public class Reverse_Bits {
  public static void main(String args[]){
    System.out.println(new Reverse_Bits().reverseBits(2));
  }
  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int answer = 0;
    for(int i =0;i<31;i++){
      answer |= (n&1);
      answer = answer<<1;
      n = n>>1;
    }
    answer |= (n&1);
    return answer;
  }
}
