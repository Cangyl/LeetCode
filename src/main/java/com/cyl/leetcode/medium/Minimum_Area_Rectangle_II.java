package com.cyl.leetcode.medium;

/**
 * Created by cang on 19-1-9.
 */
public class Minimum_Area_Rectangle_II {
  public static void main(String args[]){
    Point A = new Point(1,2);
    Point B = new Point(2,1);
    Point C = new Point(1,0);
    Point D = new Point(0,1);
    System.out.println(getAreaSquareAndTargetPoint(A,B,C));

  }
  class Solution {
    public double minAreaFreeRect(int[][] points) {

    }
  }

  public static AreaAndTargetPoint getAreaSquareAndTargetPoint(Point A, Point B, Point C){
    AreaAndTargetPoint areaAndTargetPoint = new AreaAndTargetPoint(false);
    areaAndTargetPoint =getAreaSquareAndTargetPointSub(A,B,C);
    if(areaAndTargetPoint.isEffective) return areaAndTargetPoint;
    areaAndTargetPoint =getAreaSquareAndTargetPointSub(B,A,C);
    if(areaAndTargetPoint.isEffective) return areaAndTargetPoint;
    areaAndTargetPoint =getAreaSquareAndTargetPointSub(C,B,A);
    if(areaAndTargetPoint.isEffective) return areaAndTargetPoint;
    return new AreaAndTargetPoint(false);
  }

  public static AreaAndTargetPoint getAreaSquareAndTargetPointSub(Point A,Point B, Point C){
    double AB_DistanceSquare=getDistanceSquare(A,B);
    double AC_DistanceSquare=getDistanceSquare(A,C);
    double BC_DistanceSquare=getDistanceSquare(C,B);
    Point targetPoint;
    AreaAndTargetPoint areaAndTargetPoint;
    if(AB_DistanceSquare+AC_DistanceSquare==BC_DistanceSquare) {
      if(B.x ==A.getX()){
        targetPoint = new Point(C.getX(),B.getY());
      }else if(B.y==A.getY()){
        targetPoint = new Point(B.getX(),C.getY());
      }else{

      }
      areaAndTargetPoint = new AreaAndTargetPoint(targetPoint,Math.pow(AB_DistanceSquare*AC_DistanceSquare,2)/4,true );
    }else {
      areaAndTargetPoint = new AreaAndTargetPoint(false);
    }

    return areaAndTargetPoint;
  }

  public static double getDistanceSquare(Point a, Point b){
    double _x = Math.abs(a.x - b.x);
    double _y = Math.abs(a.y - b.y);
    return (_x*_x+_y*_y);
  }
  static class AreaAndTargetPoint{
    Point D = new Point(0,0);
    double Area=0;
    boolean isEffective = false;
    @Override
    public String toString(){
      return "Area: "+Area+D+" "+isEffective;
    }
    public AreaAndTargetPoint(Point d, double area, boolean isEffective) {
      D = d;
      Area = area;
      this.isEffective=isEffective;
    }

    public AreaAndTargetPoint(boolean isEffective) {
      this.isEffective=isEffective;
    }

    public Point getD() {
      return D;
    }

    public double getArea() {
      return Area;
    }
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
