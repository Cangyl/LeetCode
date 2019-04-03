package com.cyl.leetcode.easy;

import java.util.Stack;

/**
 * Created by cang on 19-4-3.
 */
public class Implement_Queue_using_Stacks {
  public static void main(String args[]){
    MyQueue myQueue = new MyQueue();
    myQueue.push(1);
    myQueue.push(2);
    System.out.println(myQueue.peek());
    myQueue.pop();

  }
  static class MyQueue {

    private Stack<Integer> integerStack1;
    private Stack<Integer> integerStack2;
    Boolean isQueueOrder = false;
    int peek_element;
    /** Initialize your data structure here. */
    public MyQueue() {
      integerStack1 = new Stack<Integer>();
      integerStack2 = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
      if(!isQueueOrder){
        if(integerStack1.size()>0){
          integerStack1.push(x);
        }else {
          integerStack2.push(x);
        }
      }else {
        if(integerStack1.size()>0){
          dumpStackToB(integerStack1,integerStack2);
          isQueueOrder = false;
          integerStack2.push(x);
        }else {
          dumpStackToB(integerStack2,integerStack1);
          isQueueOrder = false;
          integerStack1.push(x);
        }
      }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
      if(isQueueOrder){
        if(integerStack1.size()>0){
          return integerStack1.pop();
        }else {
          return integerStack2.pop();
        }
      }else {
        if(integerStack1.size()>0){
          dumpStackToB(integerStack1,integerStack2);
          isQueueOrder = true;
          return integerStack2.pop();
        }else {
          dumpStackToB(integerStack2,integerStack1);
          isQueueOrder = true;
          return integerStack1.pop();
        }
      }
    }
    private void dumpStackToB(Stack<Integer>a, Stack<Integer>b){
      while (!a.isEmpty()){
        b.push(a.pop());
      }
    }

    /** Get the front element. */
    public int peek() {
      if(isQueueOrder){
        if(!integerStack2.isEmpty()){
          return integerStack2.peek();
        }else {
          return integerStack1.peek();
        }
      }else {
        if(!integerStack2.isEmpty()){
          dumpStackToB(integerStack2,integerStack1);
          isQueueOrder = true;
          return integerStack1.peek();
        }else {
          dumpStackToB(integerStack1,integerStack2);
          isQueueOrder = true;
          return integerStack2.peek();
        }
      }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
      return integerStack1.isEmpty()&&integerStack2.isEmpty();
    }
  }
//  class MyQueue {
//
//    Stack<Integer> pushStk = new Stack<>(); //pushStk用來完成push操作
//    Stack<Integer> popStk = new Stack<>(); // popStk用來完成pop操作
//
//
//    public void push(int x) {
//      //若pushStk為空, 表示全部元素可能在popStk中
//      if(pushStk.empty() )
//        while(!popStk.empty())
//          pushStk.push( popStk.pop() );
//
//      pushStk.push(x);
//    }
//
//
//    public void pop() {
//      //若popStk為空, 表示全部元素可能在pushStk中
//      if(popStk.empty())
//        while(!pushStk.empty())
//          popStk.push( pushStk.pop() );
//
//      popStk.pop();
//    }
//
//
//    public int peek() {
//      if(popStk.empty())
//        while(!pushStk.empty())
//          popStk.push( pushStk.pop() );
//
//      return popStk.peek();
//    }
//
//    public boolean empty() {
//      return pushStk.empty() && popStk.empty() ;
//    }
//
//  }
}
