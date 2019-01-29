package com.cyl.leetcode.medium;

/**
 * Created by cang on 19-1-17.
 */
public class Merge_Sorted_Array {
  public static void main(String args[]){
    int []nums1 = {0};
    int []nums2 = {1};
    int [] nums3 = new Merge_Sorted_Array().merge(nums1,0,nums2,1);
    for(int i =0;i<nums3.length;i++){
      System.out.println(nums3[i]);
    }

  }
  public int [] merge(int[] nums1, int m, int[] nums2, int n) {
    int idx = m+n-1;
    int i=m-1, j =n-1;
    int maxNumber = 0;
    while(i>=0&&j>=0){
      if(nums1[i]>nums2[j]){
        maxNumber = nums1[i--];
      }else{
        maxNumber = nums2[j--];
      }
      nums1[idx] = maxNumber;
      idx--;
    }
    if(j>=0){
      while(j>=0){
        nums1[idx--]=nums2[j--];
      }
    }
    return  nums1;
  }
}
