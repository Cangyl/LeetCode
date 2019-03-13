package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-13.
 */
public class Valid_Palindrome {
  public static void main(String args[]){
    String old_str = "Damosel, a poem? A carol? Or a cameo pale? (So mad!)";
//    String regex = "[^(A-Za-z0-9)]";
    System.out.println(new Valid_Palindrome().isPalindrome(old_str));
  }
  public boolean isPalindrome(String s) {
    if(s==null) return true;
    String low_s = s.toLowerCase();
    String regex = "[^A-Za-z0-9]";
    String new_s = low_s.replaceAll(regex,"");
    if(new_s == null) return  true;
    for(int i =0;i<new_s.length()/2;i++){
      if(new_s.charAt(i) != new_s.charAt(new_s.length()-i-1)){
        return false;
      }
    }
    return true;
  }
}
