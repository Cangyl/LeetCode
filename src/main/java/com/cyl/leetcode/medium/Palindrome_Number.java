package com.cyl.leetcode.medium;

/**
 * Created by cang on 19-1-29.
 */
public class Palindrome_Number {
  public static void main(String args[]){
    System.out.println(new Palindrome_Number().isPalindrome(-1211));
  }
  public boolean isPalindrome(int x) {
    int temp = x;
    int reverseNumber=0;
    while(temp>0){
      reverseNumber=reverseNumber*10 + temp%10;
      temp = temp/10;
    }
    if(reverseNumber == x){
      return true;
    }
    return false;
  }
}
