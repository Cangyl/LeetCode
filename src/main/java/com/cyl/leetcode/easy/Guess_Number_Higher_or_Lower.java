package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-24.
 */
public class Guess_Number_Higher_or_Lower {
  public static void main(String args[]){
//    System.out.println(new Guess_Number_Higher_or_Lower().guessNumber(2126753390));
    System.out.println(new Guess_Number_Higher_or_Lower().guessNumber(3));
  }
  private  int p_num = 3;
  int guess(int num){
    if(p_num<num) return -1;
    if(p_num>num) return 1;
    return 0;
  }
  public int guessNumber(int n) {
    if(n==1) return 1;
    return guessNumber(1,n);
  }
  private int guessNumber(int left, int right){
    int mid = (left + (right - left)/2);
    int guess = guess(mid);
    if(guess>0){
      return guessNumber(mid+1,right);
    }else if(guess<0){
      return guessNumber(left, mid-1);
    }
    return mid;
  }
}
