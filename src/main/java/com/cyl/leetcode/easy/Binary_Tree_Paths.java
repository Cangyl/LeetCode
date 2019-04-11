package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cang on 19-4-10.
 */
public class Binary_Tree_Paths {
  public static void main(String args[]){
    TreeNode root = new TreeNode(1);
    TreeNode treeNode_2 = new TreeNode(2);
    TreeNode treeNode_3 = new TreeNode(3);
    TreeNode treeNode_5 = new TreeNode(5);
//    root.left = treeNode_2;
//    root.right = treeNode_3;
//    treeNode_2.right = treeNode_5;
    List<String> strings = new Binary_Tree_Paths().binaryTreePaths(root);
    System.out.println("Hello world");
  }
  private List<String> strings = new LinkedList<String>();
  public List<String> binaryTreePaths(TreeNode root) {
    if(root==null) return strings;
    String string = ""+root.val;
    if(root.right==null&&root.left==null){
      strings.add(string);
    }
    binaryTreePaths(root.left,string);
    binaryTreePaths(root.right,string);
    return strings;
  }
  private void binaryTreePaths(TreeNode root,String string){
    if(root==null) return;
    if(root!=null){
      string = string+"->"+root.val;
    }
    if(root.right==null&&root.left==null){
      strings.add(string);
      return;
    }
    binaryTreePaths(root.right,string);
    binaryTreePaths(root.left,string);
  }
}
