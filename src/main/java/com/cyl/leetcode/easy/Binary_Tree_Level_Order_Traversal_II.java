package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by cang on 19-3-1.
 */
public class Binary_Tree_Level_Order_Traversal_II {
  public static void main(String args[]){
    System.out.println("hello world");
  }
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    TreeNode p = root;
    List<List<Integer>> result = new LinkedList<List<Integer>>();
    if(root == null){
      return result;
    }
    Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
    Stack<TreeNode> treeNodeStack_tmp = new Stack<TreeNode>();
    treeNodeStack.push(p);
    while(!treeNodeStack.isEmpty()){
      List<Integer> integerList = new LinkedList<Integer>();
      while(!treeNodeStack.isEmpty()){
        TreeNode treeNode = treeNodeStack.pop();
        integerList.add(treeNode.val);
        treeNodeStack_tmp.push(treeNode);
      }
      result.add(integerList);
      while (!treeNodeStack_tmp.isEmpty()){
        TreeNode treeNode = treeNodeStack_tmp.pop();
        if(treeNode.right!=null) treeNodeStack.push(treeNode.right);
        if(treeNode.left!=null) treeNodeStack.push(treeNode.left);
      }
    }
    for(int i =0;i<result.size()/2;i++){
      List<Integer> integerList = result.get(i);
      result.set(i,result.get(result.size()-i-1));
      result.set(result.size()-i-1,integerList);
    }
    return result;
  }
}
