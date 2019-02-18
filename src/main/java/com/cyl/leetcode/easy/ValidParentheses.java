package com.cyl.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by cang on 19-2-17.
 */
public class ValidParentheses {
  public static void main(String args[]){
    System.out.println(new ValidParentheses().isValid("()"));
  }
  public boolean isValid(String s) {
    Map<String, String> CoupleString = new HashMap<String, String>();
    CoupleString.put(")","(");
    CoupleString.put("}","{");
    CoupleString.put("]","[");
    Stack<String> aCharStringStack = new Stack<String>();
    aCharStringStack.empty();
    for(int i =0;i<s.length();i++){
      String aCharStr = s.substring(i,i+1);
      if(!aCharStringStack.isEmpty()&&CoupleString.containsKey(aCharStr)
          &&aCharStringStack.lastElement().equals(CoupleString.get(aCharStr))){
        aCharStringStack.pop();
      }else {
        aCharStringStack.push(aCharStr);
      }
    }
    return aCharStringStack.empty();
  }
}
