package com.cyl.leetcode.medium;


import java.awt.Point;
import java.util.*;

/**
 * Created by cang on 19-1-15.
 */
public class Minimum_Area_Rectangle_II_Solution {
  public static void main(String args[]){
    int [][]pointList ={{1,2},{2,1},{1,0},{0,1}};
    System.out.println(new Minimum_Area_Rectangle_II_Solution().minAreaFreeRect2(pointList));
  }
  public double minAreaFreeRect2(int[][] points) {
    int N = points.length;
    Point[] A = new Point[N];
    for (int i = 0; i < N; ++i)
      A[i] = new Point(points[i][0], points[i][1]);

    Map<Integer, Map<Point, List<Point>>> seen = new HashMap();
    for (int i = 0; i < N; ++i)
      for (int j = i+1; j < N; ++j) {
        // center is twice actual to keep integer precision
        Point center = new Point(A[i].x + A[j].x, A[i].y + A[j].y);

        int r2 = (A[i].x - A[j].x) * (A[i].x - A[j].x);
        r2 += (A[i].y - A[j].y) * (A[i].y - A[j].y);
        if (!seen.containsKey(r2))
          seen.put(r2, new HashMap<Point, List<Point>>());
        if (!seen.get(r2).containsKey(center))
          seen.get(r2).put(center, new ArrayList<Point>());
        seen.get(r2).get(center).add(A[i]);
      }

    double ans = Double.MAX_VALUE;
    for (Map<Point, List<Point>> info: seen.values()) {
      for (Point center: info.keySet()) {  // center is twice actual
        List<Point> candidates = info.get(center);
        int clen = candidates.size();
        for (int i = 0; i < clen; ++i)
          for (int j = i+1; j < clen; ++j) {
            Point P = candidates.get(i);
            Point Q = candidates.get(j);
            Point Q2 = new Point(center);
            Q2.translate(-Q.x, -Q.y);
            double area = P.distance(Q) * P.distance(Q2);
            if (area < ans)
              ans = area;
          }
      }
    }

    return ans < Double.MAX_VALUE ? ans : 0;
  }
  public double minAreaFreeRect(int[][] points) {
    double ans = Double.MAX_VALUE;
    int N = points.length;
    Point []Arr = new Point[N];
    Set<Point> pointSet = new HashSet<Point>();
    for(int i=0;i<points.length;i++){
      Arr[i] = new Point(points[i][0],points[i][1]);
      pointSet.add(Arr[i]);
    }
    for(int i =0;i<N;i++){
      Point A = (Arr[i]);
      for(int j =0;j<N;j++){
        if(i!=j){
          Point B = (Arr[j]);
          for(int k =j+1;k<N;k++){//BC两点的顺序无所谓，所以BC和CB是一样的，所以统一以BC代替
            if(k!=i&&k!=j){
              Point C = (Arr[k]);
              Point D = new Point(C.x-A.x+B.x,C.y-A.y+B.y);
              if(pointSet.contains(D)){
                int dot = (A.x-B.x)*(D.x-B.x)+(A.y-B.y)*(D.y-B.y);
                if(dot ==0){
                  double area = A.distance(B)*A.distance(C);
                  if(area<ans){
                    ans=area;
                  }
                }
              }
            }
          }
        }
      }
    }
    return ans < Double.MAX_VALUE ? ans : 0;
  }
}
