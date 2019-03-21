package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-21.
 */
public class Two_Sum_II_Input_array_is_sorted {
  public static void main(String args[]){
    int [] nums = {5, 25,75};
    int [] result = new Two_Sum_II_Input_array_is_sorted().twoSum(nums,30);
    System.out.println(result[0]+" "+result[1]);
  }
//  public int[] twoSum(int[] numbers, int target) {
//    int l = 0, r = numbers.length - 1;
//    while (numbers[l] + numbers[r] != target) {
//      if (numbers[l] + numbers[r] > target) r--;
//      else l++;
//    }
//    return new int[]{l + 1, r + 1};
//  }
  public int[] twoSum(int[] numbers, int target) {
    for(int i = 0;i<numbers.length;i++){
      int j = twoSum_sub(i+1, numbers.length-1,target-numbers[i],numbers);
      if(j>0){
        int [] result = new int[2];
        result[0] = i+1;
        result[1] = j+1;
        return result;
      }
    }
    return null;
  }
  public int twoSum_sub (int left, int right, int target, int []nums){
    if(left>right){
      return -1;
    }
    int mid = (left+right)/2;
    if(nums[mid] == target){
      return mid;
    }else if(nums[mid]<target){
      return twoSum_sub(mid+1,right,target,nums);
    }else if(nums[mid]>target){
      return twoSum_sub(left,mid-1,target,nums);
    }
    return -1;
  }
}
