package chapters.chapter_09.exercises;

import chapters.chapter_10.exercises.MyRectangle2D;

import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points: ");
        double[][] points = new double[5][2];
        for (int row = 0; row < points.length; row++) {
            for (int col = 0; col < points[row].length; col++) {
                points[row][col] = input.nextDouble();
            }
        }
        System.out.println("The bounding rectangle's center (" + getRectangle(points).getX() + ", " + getRectangle(points).getY() + "), width " + getRectangle(points).getWidth() + ", height " + getRectangle(points).getHeight());
    }
    public static MyRectangle2D getRectangle(double[][] points){
        double mostLeft = points[0][0];
        double mostRigth = points[0][0];
        double mostTop = points[0][1];
        double mostBottom = points[0][1];
        for (int row = 1; row < points.length; row++) {
            if (points[row][0] < mostLeft){
                mostLeft = points[row][0];
            }
            if (points[row][0] > mostRigth){
                mostRigth = points[row][0];
            }
            if (points[row][1] > mostTop){
                mostTop = points[row][1];
            }
            if (points[row][1] < mostBottom){
                mostBottom = points[row][1];
            }
        }
       return new MyRectangle2D(mostLeft + (mostRigth - mostLeft) / 2.0,mostBottom + (mostTop - mostBottom) / 2.0,mostRigth - mostLeft,mostTop - mostBottom);
    }

}
