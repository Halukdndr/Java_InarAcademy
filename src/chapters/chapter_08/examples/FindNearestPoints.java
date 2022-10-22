package chapters.chapter_08.examples;

import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.println("Enter " + numberOfPoints + " points");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        findTheClosestPoints(points);

    }
    public static void findTheClosestPoints(double[][] points){
        double shortestDistance = Math.sqrt(Math.pow(points[1][0] - points[0][0],2) + Math.pow(points[1][1] - points[0][1],2));
        int indexOfOneOfTheClosestPoint1 = 0;
        int indexOfOneOfTheClosestPoint2 = 1;
        for (int i = 1; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (Math.sqrt(Math.pow(points[j][0] - points[i][0],2) + Math.pow(points[j][1] - points[i][1],2)) < shortestDistance){
                    shortestDistance = Math.sqrt(Math.pow(points[j][0] - points[i][0],2) + Math.pow(points[j][1] - points[i][1],2));
                    indexOfOneOfTheClosestPoint1 = i;
                    indexOfOneOfTheClosestPoint2 = j;
                }
            }
        }
        System.out.println("The closest two points are (" + points[indexOfOneOfTheClosestPoint1][0] + ", " + points[indexOfOneOfTheClosestPoint1][1] + ") and (" + points[indexOfOneOfTheClosestPoint2][0] + ", " + points[indexOfOneOfTheClosestPoint2][1] + ")");
    }
}