package com.something;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Lenovo\\first\\src\\source.txt");

        Scanner sc = new Scanner(file);
        //used ArrayList because number of values unknown
        ArrayList<Point> pointsList = new ArrayList<>();

        while (sc.hasNext()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x,y);
            //Adding each point to the list
            pointsList.add(point);
        }

        //Converting values to the Point object
        Point[] pointsArray = pointsList.toArray(new Point[0]);
        Shape shape = new Shape(pointsArray);

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("AverageSide: " + shape.getAverageSide());
        System.out.println("LongestSide: " + shape.getLongestSide());
    }
}

