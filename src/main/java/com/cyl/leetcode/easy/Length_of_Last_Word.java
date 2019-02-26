package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-2-25.
 */
public class Length_of_Last_Word {
  public static void main(String args[]){
    System.out.println(new Length_of_Last_Word().lengthOfLastWord("Hello world!"));
  }
  public int lengthOfLastWord(String s) {
    String [] strings = s.split(" ");
    int len = strings.length;
    if(len==0){
      return 0;
    }else {
      return strings[len-1].length();
    }
  }
}
