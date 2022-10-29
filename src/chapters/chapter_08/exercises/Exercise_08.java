package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        display(points);

    }
    public static void display(double[][] points){
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (getDistance(points,i,j) == getTheShortestDistance(points)){
                    System.out.println("The closest two points are (" + points[i][0] + "," + points[i][1] + ") and (" + points[j][0] + "," + points[j][1] + ")");
                }
            }
        }
        System.out.println("Their distance is " + getTheShortestDistance(points));

    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points (2D)");
        int numberOfPoints = input.nextInt();
        System.out.println("Enter " + numberOfPoints + " points:");
        double[][] points = new double[numberOfPoints][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }
    public static double getTheShortestDistance(double[][] points){
        double shortestDistance = Double.MAX_VALUE;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if(getDistance(points,i,j) < shortestDistance){
                    shortestDistance = getDistance(points,i,j);
                }
            }
        }
        return shortestDistance;
    }

    private static double getDistance(double[][] points,int point1,int point2) {
        return Math.sqrt(Math.pow(points[point2][0] - points[point1][0],2) + Math.pow(points[point2][1] - points[point1][1],2));
    }
}
