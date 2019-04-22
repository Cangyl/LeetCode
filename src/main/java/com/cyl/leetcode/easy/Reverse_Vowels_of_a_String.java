package com.cyl.leetcode.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by cang on 19-4-17.
 */
public class Reverse_Vowels_of_a_String {
  public static void main(String args[]){
    String s = "leetcode";
    System.out.println(new Reverse_Vowels_of_a_String().reverseVowels(s));
  }
  public String reverseVowels(String s) {
    char [] chars = s.toCharArray();
    Set<Character> characters = new HashSet<Character>();
    characters.add('a');
    characters.add('e');
    characters.add('i');
    characters.add('o');
    characters.add('u');
    characters.add('A');
    characters.add('E');
    characters.add('I');
    characters.add('O');
    characters.add('U');
    Stack<Character> characterStack = new Stack<Character>();
    for(int i =0;i<chars.length;i++){
      if(characters.contains(chars[i])){
        characterStack.push(chars[i]);
      }
    }
    for(int i =0;i<chars.length;i++){
      if(characters.contains(chars[i])){
        chars[i] = characterStack.pop();
      }
    }
    return String.valueOf(chars);
  }
//  public String reverseVowels(String s) {
//    if (s == null) {
//      throw new IllegalArgumentException();
//    }
//    if (s.length() <= 1) {
//      return s;
//    }
//    char[] str = s.toCharArray();
//    for (int i = 0, j = str.length - 1; i < j; i++, j--) {
//      while (i < j && !isVowel(str[i])) i++;
//      while (i < j && !isVowel(str[j])) j--;
//      if (i <= j) swap(str, i, j);
//    }
//    return new String(str);
//  }
//  private boolean isVowel(char ch) {
//    char c = Character.toLowerCase(ch);
//    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//  }
//  private void swap(char[] str, int i, int j) {
//    char tmp = str[i];
//    str[i] = str[j];
//    str[j] = tmp;
//  }
}
