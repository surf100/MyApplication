package com.something;

public class Shape {
    private Point[] points;
    //save the value of perimeter so i won't have to find it again in averageSide
    private double perim;

    public Shape(Point[] points){
        this.points = points;
    }
    public double perimeter(){
        double perimeter = 0;
        int len = points.length;

        for(int i = 0;i<len;i++){
            Point currentPoint = points[i];
            //used (i+1)%len so index will not be out of range
            Point nextPoint = points[(i+1)%len];
            perimeter += currentPoint.distanceTo(nextPoint);
        }
        this.perim = perimeter;
        return perimeter;
    }
    public double getAverageSide(){
        int numOfSides = points.length;
        return (perim/numOfSides);
    }
    public double getLongestSide(){
        double longestSide = 0;
        for(int i = 0;i< points.length;i++){
            Point currentPoint = points[i];
            Point nextPoint = points[(i+1)% points.length];
            //compare to sides in order to find maximum
            longestSide = Math.max(currentPoint.distanceTo(nextPoint),longestSide);
        }
        return longestSide;
    }
}
