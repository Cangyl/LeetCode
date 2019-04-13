package com.cyl.leetcode.easy;

import com.cyl.leetcode.easy.utils.ListNode;

public class Reverse_Linked_List {
    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        new MergeTwoSortedLists().add_last_element(l1,2);
        new MergeTwoSortedLists().add_last_element(l1,3);
        new MergeTwoSortedLists().add_last_element(l1,4);
        new MergeTwoSortedLists().add_last_element(l1,5);
        new MergeTwoSortedLists().add_last_element(l1,6);
        new MergeTwoSortedLists().add_last_element(l1,7);
        new MergeTwoSortedLists().add_last_element(l1,8);
        new MergeTwoSortedLists().add_last_element(l1,9);
        ListNode reverseList = new Reverse_Linked_List().reverseList(l1);
        do{
            System.out.println(reverseList.val);
            reverseList= reverseList.next;
        }while(reverseList!=null);
    }
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode result =null;
        if(p==null)return null;
        while (p!=null){
            ListNode q = p;
            p = p.next;
            q.next = result;
            result = q;

        }
        return result;
    }

}
