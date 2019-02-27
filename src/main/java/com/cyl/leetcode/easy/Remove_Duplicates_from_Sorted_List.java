package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.ListNode;

/**
 * Created by cang on 19-2-27.
 */
public class Remove_Duplicates_from_Sorted_List {
  public static void main(String args[]){
    ListNode head = new ListNode(1);
    ListNode head_1 = new ListNode(1);
    head.next=head_1;
    ListNode head_2 = new ListNode(1);
    head_1.next = head_2;
    ListNode head_3 = new ListNode(2);
    head_2.next = head_3;
    ListNode head_new = new Remove_Duplicates_from_Sorted_List().deleteDuplicates(head);
    for(ListNode p = head_new; p!=null;p=p.next){
      System.out.println(p.val);
    }
  }
  public ListNode deleteDuplicates(ListNode head) {
    if(head ==null) return head;
    ListNode p =  head;
    int duplicat_int =head.val;
    while(p.next!=null){
      if(p.next.val == duplicat_int){
        p.next = p.next.next;
      }else {
        duplicat_int = p.next.val;
        p =p.next;
      }
    }
    return head;
  }
}
