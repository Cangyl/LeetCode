package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-23.
 */
public class Sum_of_Two_Integers {
  public static void main(String args[]){
    System.out.println(new Sum_of_Two_Integers().getSum(-1,2));
  }
  /*
  * For this, problem, for example, we have a = 1, b = 3,

In bit representation, a = 0001, b = 0011,

First, we can use "and"("&") operation between a and b to find a carry.

carry = a & b, then carry = 0001

Second, we can use "xor" ("^") operation between a and b to find the different bit, and assign it to a,

Then, we shift carry one position left and assign it to b, b = 0010.

Iterate until there is no carry (or b == 0)*/
  public int getSum(int a, int b) {
    if (a == 0) return b;
    if (b == 0) return a;

    while (b != 0) {
      int carry = a & b;
      a = a ^ b;
      b = carry << 1;
    }

    return a;
  }
}
