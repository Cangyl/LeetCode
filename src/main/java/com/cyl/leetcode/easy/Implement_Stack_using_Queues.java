package com.cyl.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by cang on 19-4-1.
 */
public class Implement_Stack_using_Queues {
  public static void main(String args[]){
    MyStack myStack = new MyStack();
    myStack.push(1);
    myStack.push(2);
    System.out.println(myStack.pop());
    System.out.println(myStack.top());

  }
//  class MyStack {
//
//    private Queue<Integer> qA = new LinkedList<Integer>();
//    private Queue<Integer> qB = new LinkedList<Integer>();
//    // Push element x onto stack.
//    public void push(int x) {
//      if(qB.isEmpty())
//        qA.add(x);
//      else
//        qB.add(x);
//    }
//
//    // Removes the element on top of the stack.
//    public void pop() {
//      int tmp;
//      if(qB.isEmpty()){
//        while(!qA.isEmpty()){
//          tmp=qA.poll();
//          if(qA.isEmpty()) return;
//          qB.add(tmp);
//        }
//      }else{
//        while(!qB.isEmpty()){
//          tmp=qB.poll();
//          if(qB.isEmpty()) return;
//          qA.add(tmp);
//        }
//      }
//    }
//
//    // Get the top element.
//    public int top() {
//      int tmp=0;
//      if(qB.isEmpty()){
//        while(!qA.isEmpty()){
//          tmp=qA.poll();
//          qB.add(tmp);
//        }
//      }else{
//        while(!qB.isEmpty()){
//          tmp=qB.poll();
//          qA.add(tmp);
//        }
//      }
//      return tmp;
//
//    }
//
//    // Return whether the stack is empty.
//    public boolean empty() {
//      return qA.isEmpty()&&qB.isEmpty();
//    }
//
//  }
  static class MyStack {
    private Queue<Integer> integerQueue;
    private int top;

    /** Initialize your data structure here. */
    public MyStack() {
      integerQueue  = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
      integerQueue.add(x);
      top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
      int size = integerQueue.size();
      for(int i =0;i<size-1;i++){
        int element = integerQueue.remove();
        integerQueue.add(element);
        top = element;
      }
      return integerQueue.remove();
    }

    /** Get the top element. */
    public int top() {
      return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
      return integerQueue.isEmpty();
    }
  }
}
