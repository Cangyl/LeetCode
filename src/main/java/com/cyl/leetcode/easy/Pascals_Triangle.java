package com.cyl.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cang on 19-3-11.
 */
public class Pascals_Triangle {
  public static void main(String args[]){
    new Pascals_Triangle().generate(5);
  }
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new LinkedList<List<Integer>>();
    if(numRows==0) return result;
    if(numRows >=1){
      List<Integer> integerList = new LinkedList<Integer>();
      integerList.add(1);
      result.add(integerList);
    }
    if(numRows >=2){
      List<Integer> integerList = new LinkedList<Integer>();
      integerList.add(1);
      integerList.add(1);
      result.add(integerList);
    }
    if(numRows >2){
      for(int i = 3;i<=numRows;i++){
        List<Integer> integerList = new LinkedList<Integer>();
        integerList.add(1);
        for(int j =1;j<i-1;j++){
          integerList.add(result.get(i-2).get(j-1)+result.get(i-2).get(j));
        }
        integerList.add(1);
        result.add(integerList);
      }
    }
    return result;

  }
}
