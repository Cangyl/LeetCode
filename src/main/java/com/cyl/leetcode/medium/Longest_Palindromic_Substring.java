package com.cyl.leetcode.medium;

/**
 * Created by cang on 19-1-30.
 */
public class Longest_Palindromic_Substring {
  public static void main(String args[]){
    String str = "abababca";
//    int [] next = new Longest_Palindromic_Substring().findNext(str, new int[str.length()]);
//    getNext(str);
    int [] next = kmpnext(str);
    for(int i =0;i<next.length;i++){
      System.out.println(next[i]);
    }

  }
  public static int[] kmpnext(String dest){
    int[] next = new int[dest.length()];
    next[0] = 0;
    for(int i = 1,j = 0; i < dest.length(); i++){
      while(j > 0 && dest.charAt(j) != dest.charAt(i)){
        j = next[j - 1];
        System.out.println("j = "+j);
      }
      if(dest.charAt(i) == dest.charAt(j)){
        j++;
      }
      next[i] = j;

    }
    return next;
  }

  public static int[] getNext(String ps) {
    char[] p = ps.toCharArray();
    int[] next = new int[p.length];
    next[0] = -1;
    int j = 0;
    int k = -1;
    while (j < p.length) {
      if (k == -1 || p[j] == p[k]) {
        next[++j] = ++k;
      } else {
        k = next[k];
        System.out.println("k = "+k);
      }
    }
    return next;
  }

  public int[] findNext(String str, int [] next){
    next[0] =-1;
    int i = 0;
    int j =-1;
    while(i<str.length()-1){
      if(j==-1 || str.charAt(i) == str.charAt(j)){
        i++;
        j++;
        next[i]=j;
      }
      else{
        j=next[j];
        System.out.println("j = "+j);
      }
    }
    return next;
  }
}
