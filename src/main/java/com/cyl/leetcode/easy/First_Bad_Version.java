package com.cyl.leetcode.easy;

public abstract class First_Bad_Version {
    abstract boolean isBadVersion(int version);
    public static void main(String args[]){
//        Boolean [] booleans = {false,false,false,false,true,true,true,true,true};
//        System.out.println(new First_Bad_Version().firstBadVersion(booleans));
    }
    public int firstBadVersion(int n) {
        if(!isBadVersion(n)){
            return -1;
        }
        int left = 1;
        int right = n;
        while(left<right){
            int mid = (left+right)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }
    private int getBadVersion(int left, int right){
        if(left > right) return -1;
        if(left == right){
            if(isBadVersion(left)) return left;
            return left;
        }
        int mid = left + (right - left) / 2;
        if(isBadVersion(mid)==true){
            right = mid;
        }else {
            left = mid +1;
        }
        return getBadVersion(left, right);
    }
//    public int firstBadVersion(int n) {
//        if (!isBadVersion(n)){
//            return -1;
//        }
//        int left = 1, right = n;
//        while (left < right){
//            int mid = left + (right - left) / 2;
//            if (isBadVersion(mid)){
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
}
