package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by cang on 19-2-28.
 */
public class SymmetricTree {
  public static void main(String args[]){
    TreeNode p = new TreeNode(1);
    TreeNode p_2 = new TreeNode(2);
    TreeNode p_3 = new TreeNode(2);
    TreeNode p_4 = new TreeNode(7);
    TreeNode p_5 = new TreeNode(6);
    TreeNode p_6 = new TreeNode(6);
    TreeNode p_7 = new TreeNode(7);
    TreeNode p_8 = new TreeNode(8);
    p.left = p_2;
    p.right = p_3;
    p_2.left = p_4;
    p_2.right = p_5;
    p_3.left =p_6;
    p_3.right = p_7;
//    p_7.right = p_8;
    System.out.println(new SymmetricTree().isSymmetric(p));
  }
  public boolean isSymmetric(TreeNode root) {
    Stack<TreeNode> treeStack = new Stack<TreeNode>();
    treeStack.push(root);
    Stack<TreeNode> treeStack_temp = new Stack<TreeNode>();
    while(treeStack.size()>0){
      for(int i =0;i<treeStack.size()/2;i++){
        TreeNode p = treeStack.get(i);
        TreeNode q = treeStack.get(treeStack.size()-i-1);
        if(p==null&&q==null) continue;
        if(p==null|q==null) return false;
        if(p.val!=q.val)return false;
      }
      while (treeStack.size()>0){
        treeStack_temp.push(treeStack.pop());
      }
      while(treeStack_temp.size()>0){
        TreeNode p = treeStack_temp.pop();
        if(p!=null){
          treeStack.push(p.left);
          treeStack.push(p.right);
        }
      }
    }
    return true;
  }
}
