package com.cyl.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cang on 19-5-6.
 */
public class Convert_a_Number_to_Hexadecimal {
  public static void main(String args[]){
//    List<String> testList = new LinkedList<String>();
//    testList.add(0,"dd");
//    System.out.println(testList.get(0));
    System.out.println(new Convert_a_Number_to_Hexadecimal().toHex(258));
  }
//  public String toHex(int num) {
//    String s = "";
//    do {
//      int cur = num & 15;
//      if (cur >= 10) {
//        s = (char) (cur - 10 + 'a') + s;
//      } else {
//        s = cur + s;
//      }
//      num >>>= 4;
//    } while (num != 0);
//    return s;
//  }
  public String toHex(int num) {
    List<String> result = new LinkedList<String>();
    while(num!=0){
      int shift = num & 15;
      result.add(0, Integer.toHexString(shift));
      num = num >>>4;
    }
    StringBuilder result_1 = new StringBuilder();
    if(result.size()==0){
      result_1.append("0");
    }
    for(int i=0;i<result.size();i++){
      result_1.append(result.get(i));
    }
    return result_1.toString();
  }
}
