package com.cyl.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cang on 19-4-9.
 */
public class Valid_Anagram {
  public static void main(String args[]){
    System.out.println("hello");
  }
  public boolean isAnagram(String s, String t) {
    int length_s = s.length();
    int length_t = t.length();
    if(length_s!=length_t) return false;
    Map<Character,Integer> characterIntegerMap = new HashMap<Character, Integer>();
    for(int i =0;i<length_s;i++){
      Character c = s.charAt(i);
      if(characterIntegerMap.keySet().contains(c)){
        Integer count = characterIntegerMap.get(c);
        count++;
        characterIntegerMap.put(c, count);
      }else {
        characterIntegerMap.put(c,1);
      }
    }
    for(int i = 0;i<length_t;i++){
      Character c =t.charAt(i);
      if(characterIntegerMap.keySet().contains(c)){
        int count = characterIntegerMap.get(c);
        count --;
        characterIntegerMap.put(c,count);
      }
    }
    for(Integer counts : characterIntegerMap.values()){
      if(counts>0)
        return false;
    }
    return true;
  }
//  public boolean isAnagram(String s, String t) {
//    if(s.length()!=t.length()){
//      return false;
//    }
//    int[] count = new int[26];
//    for(int i=0;i<s.length();i++){
//      count[s.charAt(i)-'a']++;
//      count[t.charAt(i)-'a']--;
//    }
//    for(int i:count){
//      if(i!=0){
//        return false;
//      }
//    }
//    return true;
//  }
}
