package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.ListNode;

import java.util.Stack;

/**
 * Created by cang on 19-4-3.
 */
public class Palindrome_Linked_List {
  public static void main(String args[]){
    System.out.println("Hello");
  }
  public boolean isPalindrome(ListNode head) {
    if(head == null) return true;
    ListNode p = head;
    Stack<ListNode> listNodeStack = new Stack<ListNode>();
    while(p!=null){
      listNodeStack.push(p);
      p = p.next;
    }
    p = head;
    while(!listNodeStack.isEmpty()){
      if(p.val!=listNodeStack.pop().val)
        return false;
      p=p.next;
    }
    return true;
  }
}
