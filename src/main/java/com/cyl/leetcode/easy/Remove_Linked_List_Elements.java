package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.ListNode;

/**
 * Created by cang on 19-3-28.
 */
public class Remove_Linked_List_Elements {
  public static void main(String args[]){
    System.out.println();
  }
  public ListNode removeElements(ListNode head, int val) {
    if(head == null) return head;
    while(head!=null && head.val == val){
      head = head.next;
    }
    ListNode p = head;
    while(p!=null){
      ListNode q = p.next;
      if(q!=null && q.val==val){
        p.next=q.next;
      }else {
        p = p.next;
      }
    }
    return head;
  }
}
