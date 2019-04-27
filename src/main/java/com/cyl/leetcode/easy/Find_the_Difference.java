package com.cyl.leetcode.easy;

public class Find_the_Difference {
    public static void main(String args[]){
        System.out.println(new Find_the_Difference().findTheDifference("abc","dcab"));
    }
    public char findTheDifference(String s, String t) {
        int [] ints = new int[26];
        char [] chars = s.toCharArray();
        for(int i =0 ;i<chars.length;i++){
            ints[chars[i]-'a']++;
        }
        char [] chart = t.toCharArray();
        for(int i =0;i<chart.length;i++){
            ints[chart[i]-'a']--;
        }
        for(int i =0;i<ints.length;i++){
            if(ints[i]<0){
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}
