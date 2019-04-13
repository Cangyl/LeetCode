package com.cyl.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {
    public static void main(String args[]){
        System.out.println(new Isomorphic_Strings().isIsomorphic("aaa","bbb"));
        System.out.println(new Isomorphic_Strings().isIsomorphic("abb","bdd"));
        System.out.println(new Isomorphic_Strings().isIsomorphic("cce","aag"));
        System.out.println(new Isomorphic_Strings().isIsomorphic("ab","aa"));
    }
    public boolean isIsomorphic(String s, String t) {
        int length = s.length();
        if(length==0) return true;
        int index = 0;
        Map<Character,Character> charMap = new HashMap<Character, Character>();
        while(index<length){
            Character s_char = s.charAt(index);
            Character t_char = t.charAt(index);
            if(charMap.keySet().contains(s_char)){
                if(charMap.get(s_char)!=t_char)
                    return false;
            }else {
                if(charMap.values().contains(t_char)){
                    return false;
                }
                charMap.put(s_char,t_char);
            }
            index++;
        }
        return true;
    }
}
