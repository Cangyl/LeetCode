package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

import java.util.Stack;

/**
 * Created by cang on 19-3-1.
 */
public class Maximum_Depth_of_Binary_Tree {
  public static void main(String args[]){
    System.out.println("hello world");
  }
  public int maxDepth(TreeNode root) {
    if(root==null) return 0;
    TreeNode p =root;
    int count = 0;
    Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
    Stack<TreeNode> treeNodeStack_tmp = new Stack<TreeNode>();
    treeNodeStack.push(p);
    while(!treeNodeStack.isEmpty()){
      count ++;
      while (!treeNodeStack.isEmpty()){
        treeNodeStack_tmp.push(treeNodeStack.pop());
      }
      while (!treeNodeStack_tmp.isEmpty()){
        TreeNode tmp = treeNodeStack_tmp.pop();
        if(tmp.right!=null) treeNodeStack.push(tmp.right);
        if(tmp.left!=null) treeNodeStack.push(tmp.left);
      }
    }
    return count;
  }
}
