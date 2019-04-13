package com.cyl.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String args[]){
        System.out.println(9^-1);
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<Integer>();
        for(int i =0;i<nums.length;i++){
            integers.add(nums[i]);
            if(integers.size()<i+1)
                return true;
        }
        return false;
    }
}
