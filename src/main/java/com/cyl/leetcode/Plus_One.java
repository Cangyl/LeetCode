package com.cyl.leetcode;

/**
 * Created by cang on 19-2-25.
 */
public class Plus_One {
  public static void main(String args[]){
    int [] nums ={9,9,9,9};
    int [] new_nums = new Plus_One().plusOne(nums);
    for(int i =0;i<new_nums.length;i++){
      System.out.println(new_nums[i]);
    }
  }
  public int[] plusOne(int[] digits) {
    int i = digits.length -1;
    while(i>=0){
      digits[i] ++;
      if(digits[i]<10){
        break;
      }else {
        if(i==0){
          break;
        }
        digits[i]=0;
        i--;
      }
    }
    if(digits[0] ==10){
      int [] new_nums = new int[digits.length+1];
      new_nums[0]=1;
      for(int j =1;j<new_nums.length;j++){
        new_nums[j]=0;
      }
      return new_nums;
    }
    return digits;
  }
}
