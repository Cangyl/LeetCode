package com.cyl.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cang on 19-2-15.
 */
public class Roman_to_Integer {
  public static void main(String []args){
    int result = new Roman_to_Integer().romanToInt("MCDLXXVI");
    System.out.println(result);
  }
  public int romanToInt(String s) {
    Map<String,Integer> SpecailStr = new HashMap<String, Integer>();
    SpecailStr.put("IV",4);
    SpecailStr.put("IX",9);
    SpecailStr.put("XL",40);
    SpecailStr.put("XC",90);
    SpecailStr.put("CD",400);
    SpecailStr.put("CM",900);
    Map<String,Integer>CommonStr = new HashMap<String, Integer>();
    CommonStr.put("I",1);
    CommonStr.put("V",5);
    CommonStr.put("X",10);
    CommonStr.put("L",50);
    CommonStr.put("C",100);
    CommonStr.put("D",500);
    CommonStr.put("M",1000);
    int result = 0;
    String twoCharString ="";
    for(int i=0;i<s.length();i++){
      if(i+1<s.length()&&SpecailStr.keySet().contains(s.substring(i,i+2))){
        result = result+SpecailStr.get(s.substring(i,i+2));
        i++;
      }else {
        result = result+CommonStr.get(s.substring(i,i+1));
      }
    }
    return result;
  }
}
