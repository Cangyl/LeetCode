package com.cyl.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by cang on 19-5-7.
 */
public class Longest_Palindrome {
  public static void main(String args[]){
    String string ="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
    System.out.println(new Longest_Palindrome().longestPalindrome(string));
  }
  public int longestPalindrome(String s) {
    Set<Character> set = new HashSet<Character>();
    for (int i = 0; i < s.length(); i++)
      if (!set.add(s.charAt(i))) set.remove(s.charAt(i));
    return s.length()-Math.max(set.size()-1, 0);
  }
}
