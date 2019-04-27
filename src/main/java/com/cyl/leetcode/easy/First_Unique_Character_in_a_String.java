package com.cyl.leetcode.easy;

public class First_Unique_Character_in_a_String {
    public static void main(String args[]){
        String s = "cab";
        System.out.println(new First_Unique_Character_in_a_String().firstUniqChar(s));
    }
    public int firstUniqChar(String s) {
        if(s == null){
            return -1;
        }
        int len = s.length();
        if(len == 0) {
            return -1;
        }
        if(len == 1) {
            return 0;
        }
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for(char c : chars) {
            freq[c - 'a']++;
        }
        for(int i=0; i < chars.length; i++) {
            if(freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;

    }
//    public int firstUniqChar(String s) {
//        if(s.length()==0) return -1;
//        int [] ints = new int[123];
//        for(int i =1;i<s.length();i++){
//            if(ints[s.charAt(i)]>0 || ints[s.charAt(i)]==-1){
//                ints[s.charAt(i)] = -1;
//            }else {
//                ints[s.charAt(i)]= i;
//            }
//        }
//        if(ints[s.charAt(0)]>0 || ints[s.charAt(0)]==-1){
//            ints[s.charAt(0)] = -1;
//        }else {
//            return 0;
//        }
//        int min_index = Integer.MAX_VALUE;
//        for(int i =0;i<ints.length;i++){
//            if(ints[i]!=0 && ints[i]!=-1){
//                if(min_index > ints[i]){
//                    min_index = ints[i];
//                }
//            }
//        }
//        return min_index == Integer.MAX_VALUE ? -1: min_index;
//    }
}
