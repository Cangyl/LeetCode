package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-28.
 */
public class Nth_Digit {
  public static void main(String args[]){
//    System.out.println(new Nth_Digit().findNthDigit(190));
//    System.out.println(new Nth_Digit().findNthDigit(11));
    System.out.println(new Nth_Digit().findNthDigit(2890));
  }

  public int findNthDigit(int n) {
    int number_of_digits = 0;
    int number_of_n_plus_1_digits = 0;
    int count = 0;
    while(n>number_of_digits){
      number_of_n_plus_1_digits = number_of_digits;
      number_of_digits += 9*Math.pow(10,count)*(count+1);
      count++;
    }
    int n_diff = n - number_of_n_plus_1_digits;
    int stage_number = (n_diff-1) /count;
    int stage_number_index = (n_diff-1)% count;
    String intString = Integer.toString((int)(stage_number + Math.pow(10,count-1)));
    char result = intString.charAt(stage_number_index);
    return (result-'0');
  }
  public int num_of_digits_from_1_to_n(int n) {
    int count = 0;
    int num_of_digits =0;
    while(n > Math.pow(10,count)){
      num_of_digits += 9*Math.pow(10,count)*(count+1);
      count ++;
    }
    num_of_digits += (n-Math.pow(10,count)+1)*count;
    return num_of_digits;
  }

  //the number of 1~n have digits
//  public int findNthDigit(int n) {
//    int count = 0;
//    int num_of_digits =0;
//    while(n > Math.pow(10,count)){
//      num_of_digits += 9*Math.pow(10,count)*(count+1);
//      count ++;
//    }
//    num_of_digits += (n-Math.pow(10,count)+1)*count;
//    return num_of_digits;
//  }
}
