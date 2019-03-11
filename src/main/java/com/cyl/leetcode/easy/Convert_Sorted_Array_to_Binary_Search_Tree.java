package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

/**
 * Created by cang on 19-3-7.
 */
public class Convert_Sorted_Array_to_Binary_Search_Tree {
  public static void main(String args[]){
    int [] nums ={0,1,2,3,4,5,6,7,8,9,10};
    TreeNode root = new Convert_Sorted_Array_to_Binary_Search_Tree().sortedArrayToBST(nums);
    new Convert_Sorted_Array_to_Binary_Search_Tree().traverseTree(root);
  }
  public void traverseTree(TreeNode root){
    if(root!=null){
      System.out.println(root.val);
    }
    if(root.left!=null){
      traverseTree(root.left);
    }
    if(root.right!=null){
      traverseTree(root.right);
    }
  }
  public void traverse(int left, int right, int [] nums, TreeNode root){
    if(left<=right){
      int mid = (left+right)/2;
      root.val=nums[mid];
      if(left<= mid-1){
        TreeNode p_left = new TreeNode(0);
        root.left = p_left;
        traverse(left,mid-1,nums,p_left);
      }
      if(mid+1<= right){
        TreeNode p_right = new TreeNode(0);
        root.right=p_right;
        traverse(mid+1,right,nums,p_right);
      }
    }
  }
  public TreeNode sortedArrayToBST(int[] nums) {
    if(nums.length==0) return null;
    TreeNode root = new TreeNode(0);
    traverse(0,nums.length-1,nums,root);
    return root;
  }
}
