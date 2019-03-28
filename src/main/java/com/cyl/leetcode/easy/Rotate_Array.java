package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-26.
 */
public class Rotate_Array {
  public static void main(String args[]){
//    int [] nums = {1,2,3,4,5,6,7};
//    int [] nums1 = new Rotate_Array().rotate_some(nums,6);
//    printNums(nums1);
  }
  private static void printNums (int [] nums){
    for(int i =0 ;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
    System.out.println();
  }
  public void rotate(int[] nums, int k) {
    for(int i = 0;i<k;i++){
      rotate_one(nums);
    }
  }
  private int [] rotate_one(int [] nums){
    for(int i = nums.length-1;i>0;i--){
      int tmp = nums[i];
      nums[i] = nums[i-1];
      nums[i-1] = tmp;
    }
    return nums;
  }
//  public void reverse(int[] nums, int l, int r) {
//    while (l < r) {
//      int temp = nums[l];
//      nums[l++] = nums[--r];
//      nums[r] = temp;
//    }
//  }
//
//  public void rotate(int[] nums, int k) {
//    int n = nums.length;
//    k = (n == 0 ? 0 : k % n);
//    reverse(nums, 0    , n - k);
//    reverse(nums, n - k, n    );
//    reverse(nums, 0    , n    );
//  }

//  public void rotate(int[] nums, int k) {
//    int length=nums.length;
//    int rk=k%length;
//    int [] copy=new int[length*2];
//    for(int i=0;i<2*length;i++){
//      copy[i]=nums[i%length];
//    }
//    for(int t=length-rk,i=0;t<2*length-rk;t++,i++)
//    {
//      nums[i]=copy[t];
//
//    }
//
//  }
}
