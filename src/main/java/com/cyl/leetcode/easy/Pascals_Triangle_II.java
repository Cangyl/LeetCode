package com.cyl.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cang on 19-3-11.
 */
public class Pascals_Triangle_II {
  public static void main(String args[]){
    System.out.println(new Pascals_Triangle_II().getRow(3));
  }
  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<Integer>();
    if(rowIndex >=0) result.add(1);
    if(rowIndex >=1) result.add(1);
    if(rowIndex >=2){
      for(int i=2;i<rowIndex+1;i++){
        for(int j = i-1;j>0;j--){
          result.set(j,result.get(j)+result.get(j-1));
        }
        result.add(1);
      }
    }
    return result;
  }
}
