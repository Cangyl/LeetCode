package com.cyl.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cang on 19-4-15.
 */
public class Nim_Game {
  public static void main(String args[]){
    for(int i =1;i<100;i++)
    System.out.println(i+" "+new Nim_Game().canWinNim(i));
  }
  public boolean canWinNim(int n) {
    return n%4!=0;
  }
}
