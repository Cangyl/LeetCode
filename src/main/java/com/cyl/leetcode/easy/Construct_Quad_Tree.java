package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.Node;

/**
 * Created by cang on 19-5-20.
 */
public class Construct_Quad_Tree {
  public static void main(String args[]){
    System.out.println("Hello world");
  }
  public Node construct(int[][] grid) {
    return build(grid, 0, 0, grid.length);
  }

  private Node build(int[][] grid, int i, int j, int len) {

    if (len == 0) return null;

    if (len == 1) {
      Node node = new Node();
      node.val = grid[i][j] == 1;
      node.isLeaf = true;
      return node;
    }

    Node topLeft = build(grid, i, j, len / 2);
    Node topRight = build(grid, i, j + len / 2, len / 2);
    Node bottomLeft = build(grid, i + len / 2, j, len / 2);
    Node bottomRight = build(grid, i + len / 2, j + len / 2, len / 2);

    Node node = new Node();
    if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf) {
      if (topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
        node.isLeaf = true;
        node.val = topLeft.val;
        return node;
      }
    }

    node.topLeft = topLeft;
    node.topRight = topRight;
    node.bottomLeft = bottomLeft;
    node.bottomRight = bottomRight;

    return node;
  }
}
