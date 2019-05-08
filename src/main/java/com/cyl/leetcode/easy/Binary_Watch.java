package com.cyl.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cang on 19-5-5.
 */
public class Binary_Watch {
  public static void main(String args[]){
//    System.out.println(new Binary_Watch().readBinaryWatch(1));
    System.out.println(String.format("%03d",1));
  }
  public List<String> readBinaryWatch(int num) {
    List<String> times = new ArrayList<String>();
    for (int h=0; h<12; h++)
      for (int m=0; m<60; m++)
        if (Integer.bitCount(h * 64 + m) == num)
          times.add(String.format("%d:%02d", h, m));
    return times;
  }
}
