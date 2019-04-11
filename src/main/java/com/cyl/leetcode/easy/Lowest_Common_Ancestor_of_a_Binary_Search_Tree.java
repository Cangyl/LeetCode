package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

/**
 * Created by cang on 19-4-8.
 */
public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
  public static void main(String args[]){
    System.out.println("Hello world");
  }
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root ==null) return null;
    if(p.val<root.val&&q.val<root.val){
      return lowestCommonAncestor(root.left,p,q);
    }
    if(p.val>root.val&&q.val>root.val){
      return lowestCommonAncestor(root.right,p,q);
    }
    return root;
  }
//  public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p,
//                                              TreeNode q) {
//    int min = p.val, max = q.val;
//    if (min > max) {
//      min = q.val;
//      max = p.val;
//    }
//    while (true) {
//      if (root.val < min)
//        root = root.right;
//      else if (root.val > max)
//        root = root.left;
//      else
//        return root;
//    }
//  }
}
