package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.ListNode;

/**
 * Created by cang on 19-2-18.
 */
public class MergeTwoSortedLists {

  public static void main(String [] args){
    ListNode l1 = new ListNode(-10);
    new MergeTwoSortedLists().add_last_element(l1,-6);
    new MergeTwoSortedLists().add_last_element(l1,-1);
    new MergeTwoSortedLists().add_last_element(l1,-1);
    new MergeTwoSortedLists().add_last_element(l1,-1);
    new MergeTwoSortedLists().add_last_element(l1,2);
    new MergeTwoSortedLists().add_last_element(l1,7);
    new MergeTwoSortedLists().add_last_element(l1,8);
    new MergeTwoSortedLists().add_last_element(l1,8);

    ListNode l2 = new ListNode(-10);
    new MergeTwoSortedLists().add_last_element(l2,-10);
    new MergeTwoSortedLists().add_last_element(l2,-8);
    new MergeTwoSortedLists().add_last_element(l2,-6);
    new MergeTwoSortedLists().add_last_element(l2,0);
    new MergeTwoSortedLists().add_last_element(l2,2);
    new MergeTwoSortedLists().add_last_element(l2,5);
    new MergeTwoSortedLists().add_last_element(l2,7);

    ListNode MergedList = new MergeTwoSortedLists().mergeTwoLists(l1,l2);
    do{
      System.out.println(MergedList.val);
      MergedList= MergedList.next;
    }while(MergedList!=null);

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
  public ListNode add_last_element (ListNode list, ListNode list_element){
    ListNode index = list;
    while(index.next!=null){
      index =index.next;
    }
    index.next =list_element;
    return list;
  }
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1==null) return l2;
    if(l2==null) return l1;
    ListNode mergedList= null;
    if(l1.val>l2.val){
      mergedList= l2;
      l2 =l2.next;
      mergedList.next =null;
    }else{
      mergedList = l1;
      l1 =l1.next;
      mergedList.next=null;
    }
    ListNode index =mergedList;
    while(l1!=null &&l2!=null){
      if(l1.val>l2.val){
        index.next =l2;
        l2 =l2.next;
        index = index.next;
      }else {
        index.next =l1;
        l1 =l1.next;
        index =index.next;
      }
    }
    if(l1!=null){
      index.next=l1;
    }
    if(l2!=null){
      index.next=l2;
    }
    return mergedList;
  }
}
