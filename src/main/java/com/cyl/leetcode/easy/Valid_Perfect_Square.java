package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-22.
 */
public class Valid_Perfect_Square {
  public static void main(String args[]){
//    System.out.println(new Valid_Perfect_Square().isPerfectSquare(121));
//    System.out.println(new Valid_Perfect_Square().isPerfectSquare(1));
//    System.out.println(new Valid_Perfect_Square().isPerfectSquare(5));
//    System.out.println(new Valid_Perfect_Square().isPerfectSquare(2147483647));
    System.out.println(new Valid_Perfect_Square().isPerfectSquare(104976));
    System.out.println(Math.sqrt(104976));
  }
  public boolean isPerfectSquare(int num) {
    if(num==0)return false;
    return isPerfectSquare(num, 1, num);
  }
  private boolean isPerfectSquare(int num, int left, int right){
    if(left>right) return false;
    int mid = (left + right)/2;
    if(mid == 1.0*num/mid) {
      return true;
    }else if(mid>1.0*num/mid){
      return isPerfectSquare(num,left,mid-1);
    }else {
      return isPerfectSquare(num,mid+1,right);
    }
  }
}

