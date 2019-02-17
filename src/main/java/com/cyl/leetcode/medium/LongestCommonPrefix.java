package com.cyl.leetcode.medium;

/**
 * Created by cang on 19-2-15.
 */
public class LongestCommonPrefix {
  public static void main(String [] args){
    String []strs = {"a","ac"};
    String commonString = new LongestCommonPrefix().longestCommonPrefix(strs);
    System.out.println(commonString);
  }
  public String longestCommonPrefix(String[] strs) {
    int maxLength = 0;
    for(int j =0;j<strs.length;j++){
      if (maxLength<strs[j].length()){
        maxLength = strs[j].length();
      }
    }
    int i =0;
    String commonStr = "";
    char commonChar;
    while(i<maxLength){
      if(i<strs[0].length()){
        commonChar = strs[0].charAt(i);
      }else{
        return commonStr;
      }

      for(int j =1;j<strs.length;j++){
        if(i>=strs[j].length()||strs[j].charAt(i)!=commonChar){
          return commonStr;
        }
      }
      commonStr = commonStr+commonChar;
      i++;
    }
    return commonStr;
  }
}
