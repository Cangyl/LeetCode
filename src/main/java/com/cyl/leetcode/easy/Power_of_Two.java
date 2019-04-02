package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-2.
 */
public class Power_of_Two {
  public static void main(String args[]){
    System.out.println(new Power_of_Two().isPowerOfTwo(1) );
  }
  public boolean isPowerOfTwo(int n) {
    if(n<=0) return false;
    int lastbit=n;
    int count = 0;
    while(lastbit>0){
      lastbit = lastbit>>>1;
      count++;
    }
    for(int i =0;i<count-1;i++){
      if((n&1)==1) return false;
      n = n>>>1;
    }
    return true;
  }
}
