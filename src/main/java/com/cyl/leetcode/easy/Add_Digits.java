package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-10.
 */
public class Add_Digits {
  public static void main(String args[]){
    System.out.println(new Add_Digits().addDigits(128));
  }
  public int addDigits(int num) {
    if(num<10) return num;
    int result = 0;
    while(num>0){
      int yushu = num%10;
      result += yushu;
      num /= 10;
    }
    if(result>9){
      return addDigits(result);
    }else {
      return result;
    }
  }
//  public int addDigits(int num) {
//    if (num == 0)
//      return 0;
//    int temp = num%9;
//    if (temp == 0)
//      return 9;
//    return temp;
//  }
}
