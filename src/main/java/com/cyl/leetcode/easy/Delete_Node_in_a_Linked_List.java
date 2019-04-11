package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.ListNode;

/**
 * Created by cang on 19-4-8.
 */
public class Delete_Node_in_a_Linked_List {
  public static void main(String args[]){
    ListNode head = new ListNode(4);
    ListNode head1 = new ListNode(5);
    ListNode head2 = new ListNode(1);
    ListNode head3 = new ListNode(9);
    head.next= head1;
    head1.next = head2;
    head2.next = head3;
    new Delete_Node_in_a_Linked_List().deleteNode(head);
    System.out.println("Hello world");
  }
  public void deleteNode(ListNode node) {
    ListNode p = node;
    while(p!=null&&p.next!=null){
      p.val = p.next.val;
      if(p.next.next!=null){
        p = p.next;
      }else {
        p.next = null;
      }
    }
  }
//  public void deleteNode(ListNode node) {
//    if (node == null || node.next == null) {
//      return ;
//    }
//    node.val = node.next.val;
//    node.next = node.next.next;
//  }
}
