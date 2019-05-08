package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by cang on 19-5-5.
 */
public class Sum_of_Left_Leaves {
  public static void main(String args[]){
    TreeNode root = new TreeNode(1);
    TreeNode treeNode_2 = new TreeNode(2);
    TreeNode treeNode_3 = new TreeNode(3);
    TreeNode treeNode_5 = new TreeNode(5);
    root.left = treeNode_2;
    root.right = treeNode_3;
    treeNode_2.left = treeNode_5;
    System.out.println(new Sum_of_Left_Leaves().sumOfLeftLeaves(root));
  }
  public int sumOfLeftLeaves(TreeNode root) {
    if(root==null) return 0;
    Queue<TreeNode> elements = new LinkedList<TreeNode>();
    elements.add(root);
    int result = 0;
    while(elements.size()>0){
      TreeNode element = elements.poll();
      if(element.left!=null ){
        if(element.left.left==null && element.left.right ==null)
          result += element.left.val;
        elements.add(element.left);
      }
      if(element.right != null){
        elements.add(element.right);
      }
    }
    return result;
  }
}
