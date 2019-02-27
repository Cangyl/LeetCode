package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

/**
 * Created by cang on 19-2-27.
 */
public class Same_Tree {
  public static void main(String args[]){
    TreeNode p = new TreeNode(10);
    TreeNode p_2 = new TreeNode(5);
    TreeNode p_3 = new TreeNode(15);
    p.left = p_2;
    p.right = p_3;
    TreeNode q = new TreeNode(10);
    TreeNode q_2 = new TreeNode(5);
    TreeNode q_3 = new TreeNode(15);
    q.left = q_2;
    q_2.right = q_3;

    System.out.println(new Same_Tree().isSameTree(p,q));
  }
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p==null&&q==null) return true;
    if((p==null||q==null)||(p.val != q.val)) return false;
    if(p.val == q.val){
      return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    return false;
  }
}
