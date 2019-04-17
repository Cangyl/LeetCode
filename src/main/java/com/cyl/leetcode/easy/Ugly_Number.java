package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-11.
 */
public class Ugly_Number {
  public static void main(String args[]){
    System.out.println(new Ugly_Number().isUgly(6));
    System.out.println(new Ugly_Number().isUgly(14));
  }
  public boolean isUgly(int num) {
    if(num ==1) return true;
    while(num%2==0&&num!=0){
      num /= 2;
    }
    while(num%3==0&&num!=0){
      num /= 3;
    }
    while(num%5==0 &&num!=0){
      num /= 5;
    }
    if(num==1)return true;
    return false;
  }
}
