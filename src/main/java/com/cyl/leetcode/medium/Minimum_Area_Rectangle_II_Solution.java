package com.cyl.leetcode.medium;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cang on 19-1-15.
 */
public class Minimum_Area_Rectangle_II_Solution {
  public static void main(String args[]){
//    String pointStrings ="[[24420,16685],[20235,25520],[14540,20845],[20525,14500],[16876,24557],[24085,23720],[25427,18964],[21036,14573],[24420,23315],[22805,24760],[21547,25304],[16139,23952],[21360,14645],[24715,17120],[19765,25520],[19388,25491],[22340,25005],[25520,19765],[25365,21320],[23124,15443],[20845,14540],[24301,16532],[16685,24420],[25100,17875],[22125,25100],[15699,23468],[14592,21131],[25460,19155],[17837,25084],[23468,24301],[25460,20845],[18453,25304],[21131,14592],[22805,15240],[19475,25500],[15443,23124],[25355,21360],[15285,22880],[20000,25525],[24085,16280],[22163,25084],[22880,15285],[14916,22163],[16280,24085],[24875,17400],[22600,24875],[14573,21036],[25427,21036],[17120,24715],[25500,19475]]";
    Point A = new Point(1,2);
    Point B = new Point(1,3);
    Point C = new Point(3,1);
    Point D = new Point(3,2);
    Point E = new Point(2,0);
    Point F = new Point(0,3);
    Point G = new Point(0,1);
    Point H = new Point(3,3);
    List<Point> pointList = new ArrayList<Point>();
    pointList.add(A);
    pointList.add(B);
    pointList.add(C);
    pointList.add(D);
    pointList.add(E);
    pointList.add(F);
    pointList.add(G);
    pointList.add(H);
    System.out.println(new Minimum_Area_Rectangle_II_Solution().getMinimumArea(pointList));
  }
  public double minAreaFreeRect(int[][] points) {
    List<Point> pointList = new ArrayList<Point>();
    for(int i=0;i<points.length;i++){
      Point element = new Point(points[i][0],points[i][1]);
      pointList.add(element);
    }
    return getMinimumArea(pointList);
  }
  int printOneNumbers(int n){
    int count =0;
    while(n>0){
      if ((n&1)>0){
        count++;
      }
      n=n>>1;
    }
    return count;
  }

  double getMinimumArea(List<Point> pointList)
  {
    double minimumArea =0;
    int n =pointList.size();
    for(int i=0;(i<(1<<n));i++){
      if(printOneNumbers(i)==4){
        List<Point> subSet = new ArrayList<Point>();
        for(int j=0;j<n;j++){
          if((i&(1<<j))>0){
            subSet.add(pointList.get(j));
          }
        }
        double result = isFourPointARect(subSet);
        if(result>0&&minimumArea==0){
          minimumArea=result;
        }else if(result>0&&minimumArea!=0&&result<minimumArea){
          minimumArea = result;
        }
      }
    }
    return  Math.sqrt(minimumArea)*2;
  }

  public double isFourPointARect(List<Point> subSet){
    double areaSquare = getAreaSquare(subSet.get(0),subSet.get(1),subSet.get(2));
    if(areaSquare == 0) {
      return 0;
    }else if(getAreaSquare(subSet.get(1),subSet.get(2),subSet.get(3))==0){
      return 0;
    }else if(getAreaSquare(subSet.get(0),subSet.get(2),subSet.get(3))==0){
      return 0;
    }else if(getAreaSquare(subSet.get(0),subSet.get(1),subSet.get(3))>0){
      return areaSquare;
    }
    return 0;
  }
  public double getAreaSquare(Point A, Point B, Point C){
    double area = getAreaSquareAndTargetSub(A,B,C);
    if(area>0) {
      return area;
    }
    area =getAreaSquareAndTargetSub(B,A,C);
    if(area>0) {
      return area;
    }
    area =getAreaSquareAndTargetSub(C,B,A);
    if(area>0) {
      return area;
    }
    return 0;
  }
  public double getAreaSquareAndTargetSub(Point A, Point B, Point C){
    double AB_DistanceSquare=getDistanceSquare(A,B);
    double AC_DistanceSquare=getDistanceSquare(A,C);
    double BC_DistanceSquare=getDistanceSquare(C,B);
    double area=0;
    if(AB_DistanceSquare+AC_DistanceSquare==BC_DistanceSquare) {
      area = (AB_DistanceSquare*AC_DistanceSquare)/4;
    }
    return area;
  }

  public double getDistanceSquare(Point a, Point b){
    double _x = Math.abs(a.x - b.x);
    double _y = Math.abs(a.y - b.y);
    return (_x*_x+_y*_y);
  }
  static class Point{
    int x;
    int y;
    Point(int x, int y){
      this.x=x;
      this.y=y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }
    @Override
    public int hashCode(){
      int result=17;
      result = result * 31 + x;
      result = result * 31 + y;
      return result;
    }
    @Override
    public String toString(){
      return "Point: "+this.x+", "+this.y;
    }

    @Override
    public  boolean equals(Object obj){
      Point tmp = (Point)obj;
      if(this.x == tmp.getX() && this.y==tmp.getY()) return true;
      return false;
    }
  }
}
