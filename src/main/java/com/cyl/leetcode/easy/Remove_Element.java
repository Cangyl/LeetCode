package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-2-19.
 */
public class Remove_Element {
  public static void main(String args[]){
    int [] array ={3,3};
    System.out.println(new Remove_Element().removeElement(array,3));
  }
  public int removeElement(int[] nums, int val) {
    int l = 0, r = nums.length-1;
    while (l <= r) {
      if (nums[l] == val)
        nums[l] = nums[r--];
      else
        l++;
    }
    return l;
  }
//  public int removeElement(int[] nums, int val) {
//    int j=nums.length-1;
//    for(int i=0;i<=j;i++){
//      if(nums[i]==val){
//        while(j>=i+1&&nums[j]==val){
//          j--;
//        }
//        if(j==i){ //not found
//          return i;
//        }else {
//          nums[i] = nums[j--];
//        }
//      }
//    }
//    return j+1;
//  }
}
