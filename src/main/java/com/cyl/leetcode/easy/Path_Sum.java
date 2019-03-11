package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by cang on 19-3-7.
 */
public class Path_Sum {
  public static void main(String args[]){
//    System.out.println("Hello world!");
    TreeNode p = new TreeNode(1);
    TreeNode p_2 = new TreeNode(2);
    TreeNode p_3 = new TreeNode(3);
    TreeNode p_4 = new TreeNode(4);
    TreeNode p_5 = new TreeNode(5);
    TreeNode p_6 = new TreeNode(6);
    TreeNode p_7 = new TreeNode(7);
    TreeNode p_8 = new TreeNode(8);
    p.left = p_2;
//    p.right = p_3;
//    p_2.left = p_4;
//    p_2.right = p_5;
//    p_3.left =p_6;
//    p_3.right = p_7;
    boolean flag = new Path_Sum().hasPathSum(p,1);
    System.out.println(flag);
  }
  public boolean hasPathSum(TreeNode root, int sum) {
    if(root==null) return false;
    return traverse(root, 0,sum);

  }
  public boolean traverse(TreeNode root,int i_sum, int sum){
    i_sum += root.val;
    if(root.left!=null&&root.right!=null){
      return traverse(root.left,i_sum,sum)||traverse(root.right,i_sum,sum);
    }
    if(root.right!=null){
      return traverse(root.right,i_sum,sum);
    }
    if(root.left!=null){
      return traverse(root.left,i_sum,sum);
    }
    if(i_sum == sum){
      return true;
    }
    return false;
  }
}
