package com.cyl.leetcode.easy;

/**
 * Created by cang on 19-3-28.
 */
public class Count_Primes {
  public static void main(String args[]){
    System.out.println(new Count_Primes().countPrimes(10));
//    System.out.println(new Count_Primes().isPrime(4));
  }
  public int countPrimes(int n) {
    int count = 0;
    for(int i =1;i<n;i++){
      if(isPrime(i)){
        count++;
      }
    }
    return count;
  }
  private boolean isPrime(int n){
    if(n==1)return false;
    if(n==2) return true;
    if(n%2==0) return false;
    int headroom =(int) Math.sqrt(n);
    for(int i =2;i<=headroom;i++){
      if(n%i==0) return false;
    }
    return true;
  }
}
