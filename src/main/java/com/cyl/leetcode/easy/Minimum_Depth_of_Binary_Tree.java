package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

/**
 * Created by cang on 19-3-11.
 */
public class Minimum_Depth_of_Binary_Tree {
  public static void main(String args[]){
    System.out.println("hello world");
  }
  public int minDepth(TreeNode root) {
    if(root==null) return 0;
    return traverse(root,0);
  }
  public int traverse(TreeNode root, int count){
    count++;
    if(root.left==null&&root.right==null){
      return count;
    }
    int left_depth=Integer.MAX_VALUE, right_depth=Integer.MAX_VALUE;
    if(root.left!=null)
      left_depth = traverse(root.left,count);
    if(root.right!=null)
      right_depth = traverse(root.right,count);
    return Math.min(left_depth,right_depth);
  }
}
