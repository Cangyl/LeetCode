package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.ListNode;

import java.util.Stack;

/**
 * Created by cang on 19-3-20.
 */
public class Intersection_of_Two_Linked_Lists {
  public static void main(String args[]){

  }
  /**
   * I found most solutions here preprocess linkedlists to get the difference in len.
   Actually we don't care about the "value" of difference, we just want to make sure two pointers reach the intersection node at the same time.

   We can use two iterations to do that. In the first iteration, we will reset the pointer of one linkedlist to the head of another linkedlist after it reaches the tail node. In the second iteration, we will move two pointers until they points to the same node. Our operations in first iteration will help us counteract the difference. So if two linkedlist intersects, the meeting point in second iteration must be the intersection point. If the two linked lists have no intersection at all, then the meeting pointer in second iteration must be the tail node of both lists, which is null

   Below is my commented Java code:
   */
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //boundary check
    if(headA == null || headB == null) return null;

    ListNode a = headA;
    ListNode b = headB;

    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
      //for the end of first iteration, we just reset the pointer to the head of another linkedlist
      a = a == null? headA : a.next;
      b = b == null? headB : b.next;
    }

    return a;
  }
//  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//    if(headA == null||headB==null) return null;
//    Stack<ListNode> listNodeStack_a = new Stack<ListNode>();
//    Stack<ListNode> listNodeStack_b = new Stack<ListNode>();
//    ListNode pa = headA;
//    ListNode pb = headB;
//    while (pa!=null){
//      listNodeStack_a.push(pa);
//      pa = pa.next;
//    }
//    while (pb!=null){
//      listNodeStack_b.push(pb);
//      pb = pb.next;
//    }
//    ListNode same=null;
//    while (listNodeStack_a.size()>0 && listNodeStack_b.size()>0){
//      ListNode element_a = listNodeStack_a.pop();
//      ListNode element_b = listNodeStack_b.pop();
//      if(element_a == element_b){
//        same = element_a;
//      }else {
//        break;
//      }
//    }
//    return same;
//  }

}
