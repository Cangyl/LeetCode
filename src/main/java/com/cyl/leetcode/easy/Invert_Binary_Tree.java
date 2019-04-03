package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

/**
 * Created by cang on 19-4-2.
 */
public class Invert_Binary_Tree {
  public static void main(String args[]){
    System.out.println("Hello world");
  }
  public TreeNode invertTree(TreeNode root) {
    if(root==null) return null;
    TreeNode treeNode = root.left;
    root.left =root.right;
    root.right = treeNode;
    invertTree(root.left);
    invertTree(root.right);
    return root;
  }
}
