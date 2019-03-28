package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-25.
 */
public class Excel_Sheet_Column_Number {
  public static void main(String args[]){
//    System.out.println(new Excel_Sheet_Column_Number().titleToNumber("A"));
//    System.out.println(new Excel_Sheet_Column_Number().titleToNumber("AA"));
    System.out.println(new Excel_Sheet_Column_Number().titleToNumber("AA"));
    System.out.println(new Excel_Sheet_Column_Number().titleToNumber("AB"));
    System.out.println(new Excel_Sheet_Column_Number().titleToNumber("ZY"));
  }
  public int titleToNumber(String s) {
    int result = 0;
    for(int i = s.length()-1;i>=0;i--){
      int degree = (int)Math.pow(26,s.length()-i-1);
      int char_value = Character.valueOf(s.charAt(i)) -Character.valueOf('A')+1;
      int d_result = char_value*degree;
      result += d_result;
    }
    return result;
  }
}
