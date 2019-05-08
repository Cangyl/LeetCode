package com.cyl.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cang on 19-5-8.
 */
public class Fizz_Buzz {
  public static void main(String args[]){
    List<String> result = new Fizz_Buzz().fizzBuzz(15);
    for(int i =0;i<result.size();i++){
      System.out.println(result.get(i));
    }
  }
  public List<String> fizzBuzz(int n) {
    List<String> result = new LinkedList<String>();
    for(int i =1;i<=n;i++){
      String string = "";
      if(i%3 == 0){
        string += "Fizz";
      }
      if(i%5 == 0){
        string += "Buzz";
      }
      if("".equals(string)){
        string += i;
      }
      result.add(string);
    }
    return result;
  }
}
