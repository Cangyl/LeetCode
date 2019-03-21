package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-21.
 */
public class Excel_Sheet_Column_Title {
  public static void main(String args[]){
//    System.out.println(Integer.valueOf('A'));
//    char A = 65;
//    System.out.println(A);
//    char Z = 65+25;
//    String str = Character.toString(Z);
    System.out.println(new Excel_Sheet_Column_Title().convertToTitle(28));
    System.out.println(new Excel_Sheet_Column_Title().convertToTitle(52));
    System.out.println(new Excel_Sheet_Column_Title().convertToTitle(53));
    System.out.println(new Excel_Sheet_Column_Title().convertToTitle(701));
  }
//  public String convertToTitle(int n) {
//    StringBuilder result = new StringBuilder();
//
//    while(n>0){
//      n--;
//      result.insert(0, (char)('A' + n % 26));
//      n /= 26;
//    }
//
//    return result.toString();
//  }
  public String convertToTitle(int n) {
    StringBuilder result = new StringBuilder();
    while (n>0){
      int yushu = n%26;
      if(yushu == 0){
        n = n/26-1;
        char Z = 90;
        result.insert(0,Z);
      }else {
        n = n/26;
        char c = (char) (64+yushu);
        result.insert(0,c);
      }
    }
    return result.toString();
  }
}
