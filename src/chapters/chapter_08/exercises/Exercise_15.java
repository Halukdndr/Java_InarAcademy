package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        double[][] points = getPoints();
        if (sameLine(points)){
            System.out.println("The five points are on the same line");
        }else {
            System.out.println("The five points are not on the same line");
        }
    }
    public static double[][] getPoints(){
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.println("Enter five points:");
        for (int row = 0; row < points.length; row++) {
            for (int col = 0; col < points[row].length; col++) {
                points[row][col] = input.nextDouble();
            }
        }
        return points;
    }
    public static boolean sameLine(double[][] points){
        // row index 0 and 1 represents a line if the other points are on this line ,the five points are  on the same line.
        // so row begins with index of 2
        for (int row = 2; row < points.length; row++) {
            if ((points[1][0] - points[0][0]) * (points[row][1] - points[0][1]) - (points[row][0] - points[0][0]) * (points[1][1] - points[0][1]) != 0){
                return false;
            }
        }
        return true;
    }
}
