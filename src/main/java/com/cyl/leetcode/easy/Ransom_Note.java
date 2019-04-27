package com.cyl.leetcode.easy;

public class Ransom_Note {
    public static void main(String args[]){

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] ints= new int[123];
        for(char ch : magazine.toCharArray()){
            ints[ch]++;
        }
        for(char ch : ransomNote.toCharArray()){
            if(ints[ch]<=0) return false;
            ints[ch]--;
        }
        return true;
    }
}
