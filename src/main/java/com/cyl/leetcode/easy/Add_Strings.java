package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-5-9.
 */
public class Add_Strings {
  public static void main(String args[]){
    System.out.println(new Add_Strings().addStrings("8999","1"));
  }
  public String addStrings(String num1, String num2) {
    char [] chars1 = num1.toCharArray();
    char [] chars2 = num2.toCharArray();
    int length = Math.max(chars1.length,chars2.length);
    int [] result = new int[length+1];
    int carry = 0;
    int i =0;
    while(i<chars1.length && i<chars2.length){
      int sum = chars1[chars1.length-i-1] + chars2[chars2.length-i-1]+carry -'0'-'0';
      carry = sum/10;
      result[length -i] =  sum%10;
      i++;
    }
    while(i<chars1.length){
      int sum = chars1[chars1.length-i-1] +carry -'0';
      carry = sum/10;
      result[length -i] =  sum%10;
      i++;
    }
    while(i<chars2.length){
      int sum = chars2[chars2.length-i-1] +carry -'0';
      carry = sum/10;
      result[length -i] =  sum%10;
      i++;
    }
    if(carry!=0){
      result[0]=carry;
    }
    StringBuilder resultStr = new StringBuilder();
    if(result[0]!=0){
      resultStr.append(result[0]);
    }
    for(int w =1;w<result.length;w++){
      resultStr.append(result[w]);
    }
    return resultStr.toString();
  }
}
