package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-4-17.
 */
public class Reverse_String {
  public static void main(String args[]){
    char [] characters = {'h','e','l'};
    new Reverse_String().reverseString(characters);
    System.out.println("hello");
  }
  public void reverseString(char[] s) {
    for(int i =0;i<s.length/2;i++){
      char tmp = s[i];
      s[i]=s[s.length-1-i];
      s[s.length-1-i] = tmp;
    }
  }
}
