package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-2-21.
 */
public class Count_and_Say {
  public static void main(String args[]){
    System.out.println(new Count_and_Say().countAndSay(4));
  }
  public String countAndSay(int n) {
    if(n==1) return "1";
    StringBuilder result_str = new StringBuilder("1");
    for(int i=0;i<n-1;i++){
      result_str = countSameStr(result_str);
    }
    return result_str.toString();
  }
  public StringBuilder countSameStr(StringBuilder n_str){
    StringBuilder result_str = new StringBuilder("");
    char tmp_char = n_str.charAt(0);
    int count=1;
    if(n_str.toString().equals("1")){
      result_str =new StringBuilder("11");
    }
    for(int i=1;i<n_str.length();i++){
      if(tmp_char == n_str.charAt(i)){
        count++;
      }else {
        result_str = result_str.append(count).append(tmp_char);
        tmp_char = n_str.charAt(i);
        count=1;
      }
      if(i==n_str.length()-1){
        result_str =result_str.append(count).append(tmp_char);
      }
    }
    return result_str;
  }
}
