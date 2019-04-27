package com.cyl.leetcode.easy;

public class Move_Zeroes {
    public static void main(String args[]){
//        int [] nums = {0,1,0,3,12};
//        int [] nums = {0,0,0,0,0,0,1};
//        int [] nums = {0,1,0,3,12};
        int [] nums = {4,2,4,3,0,5,1,0,0,0};
        nums = new Move_Zeroes().moveZeroes(nums);
        for(int w =0;w<nums.length;w++){
            System.out.println(nums[w]);
        }
    }
    public int [] moveZeroes(int[] nums) {
        int num_of_tail_zeros = 0;
        for(int i =nums.length-1-1;i>=0;i--){
            if(nums[i]==0){
                for(int j = i+1;j<nums.length-num_of_tail_zeros;j++){
                    int tmp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                }
                num_of_tail_zeros++;
            }
        }
        return nums;
    }

//    public void moveZeroes(int[] nums) {
//
//        int j = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] != 0) {
//                int temp = nums[j];
//                nums[j] = nums[i];
//                nums[i] = temp;
//                j++;
//            }
//        }
//    }

    //    public void moveZeroes(int[] nums) {
//        if (nums == null || nums.length == 0) return;
//
//        int insertPos = 0;
//        for (int num: nums) {
//            if (num != 0) nums[insertPos++] = num;
//        }
//
//        while (insertPos < nums.length) {
//            nums[insertPos++] = 0;
//        }
//    }

//    public int [] moveZeroes(int[] nums) {
//        int i=0;
//        while(i<nums.length){
//            int count = 0;
//            if(nums[i]==0){
//                for(int j = i;j<nums.length;j++){
//                    if(nums[j]==0){
//                        count ++;
//                    }else break;
//                }
//               for(int j = i+count;j<nums.length;j++){
//                    int tmp = nums[j-count];
//                    nums[j-count] = nums[j];
//                    nums[j] = tmp;
//               }
//            }
//            i=(count == 0)?(i+1):(i+count);
//        }
//        return nums;
//
//    }
}
