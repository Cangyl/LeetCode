package com.cyl.leetcode;

import com.cyl.leetcode.easy.utils.ListNode;

import java.util.ArrayList;
import java.util.List;
//两个指针赛跑；逆置链表，head肯定被处理两次;把所有节点next指向自己，如果有环则会找到原来的节点其next是自己
/**
 * Created by cang on 19-3-14.
 */
public class Linked_List_Cycle {
  public static void main(String args[]){
    ListNode l1 = new ListNode(1);
    new Linked_List_Cycle().add_last_element(l1,2);
    new Linked_List_Cycle().add_last_element(l1,3);
    new Linked_List_Cycle().add_last_element(l1,4);
    new Linked_List_Cycle().add_last_element(l1,5);
    new Linked_List_Cycle().add_last_element(l1,6);
    new Linked_List_Cycle().add_last_element(l1,7);
    new Linked_List_Cycle().add_last_element(l1,8);
    new Linked_List_Cycle().hasCycle(l1);
    System.out.println("hello world");
  }
  public ListNode add_last_element (ListNode list, int a){
    ListNode list_element = new ListNode(a);
    ListNode index = list;
    while(index.next!=null){
      index =index.next;
    }
    index.next =list_element;
    return list;
  }
  public boolean hasCycle(ListNode head) {
    ListNode next = head;
    while (next != null) {
      if (next.next == next)
        return true;
      ListNode tmp = next.next;
      next.next = next;
      next = tmp;
    }
    return false;
  }
}
