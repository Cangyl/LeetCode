package com.cyl.leetcode.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {
  public static void main(String args[]){
    String trash = "[\"MinStack\",\"push\",\"push\",\"push\",\"top\",\"pop\",\"getMin\",\"pop\",\"getMin\",\"pop\",\"push\",\"top\",\"getMin\",\"push\",\"top\",\"getMin\",\"pop\",\"getMin\"]\n" +
        "[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]\n";
    MinStack obj = new MinStack();
    obj.push(-2);
    obj.push(0);
    obj.push(-3);
    obj.push(-4);
    obj.push(-5);
    int min = obj.getMin();
    System.out.println(min);
    obj.pop();
    int top = obj.top();
    System.out.println(top);
    min = obj.getMin();
    System.out.println(min);
    System.out.println("over");

  }
  Stack<Integer> stack=new Stack<Integer>();
  int min=Integer.MAX_VALUE;
  public void push(int x) {
    if(x<=min) {stack.push(min); min=x;}
    stack.push(x);
  }
  public void pop() {
    if(stack.peek()==min){ stack.pop(); min=stack.pop(); }
    else stack.pop();
  }
  public int top() {
    return stack.peek();
  }
  public int getMin() {
    return min;
  }
}
