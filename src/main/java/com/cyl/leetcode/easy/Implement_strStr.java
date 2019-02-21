package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-2-21.
 */
public class Implement_strStr {
  public static void main(String args[]){
    System.out.println(new Implement_strStr().strStr("",""));
  }
  public int strStr(String haystack, String needle) {
    if("".equals(needle)) return 0;
    if("".equals(haystack)) return -1;
    int len_haystack = haystack.length();
    int len_needle = needle.length();
    int next[] = findNext(needle);
    int i=0,j=0;
    while (i<len_haystack&&j<len_needle){
      if(haystack.charAt(i)==needle.charAt(j)){
        if(j==len_needle-1){
          return i-j;
        }
        i++;
        j++;
      }else {
        if(j==0){
          i++;
        }else {
          j =next[j-1];
        }
      }
    }
    return -1;
  }
  public int [] findNext (String needle){
    int len = needle.length();
    int [] next= new int[len];
    next[0] = 0;
    int i =1;
    int j =0;
    while(i<len&&j<len){
      if(needle.charAt(j)==needle.charAt(i)){
        next[i]=j+1;
        j++;
        i++;
      }else {
        if(j==0){
          next[i]=0;
          i++;
        }else {
          j =next[j-1];
        }
      }
    }
    return next;
  }
}
