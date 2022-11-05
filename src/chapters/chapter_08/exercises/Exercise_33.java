package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        for (int row = 0; row < points.length; row++) {
            for (int col = 0; col < points[row].length; col++) {
                points[row][col] = input.nextDouble();
            }
        }
        double[][] swaped = swap(points);
        double[] abcdef = Exercise_31.getABCDEF(swaped);
        double[] intersectingPoint = Exercise_31.getIntersectingPoint(abcdef);
        double[] areaOfTriangles = new double[4];
        areaOfTriangles[0] = getSubArea(points[0][0],points[0][1],points[2][0],points[2][1],intersectingPoint[0],intersectingPoint[1]);
        areaOfTriangles[1] = getSubArea(points[0][0],points[0][1],points[3][0],points[3][1],intersectingPoint[0],intersectingPoint[1]);
        areaOfTriangles[2] = getSubArea(points[2][0],points[2][1],points[1][0],points[1][1],intersectingPoint[0],intersectingPoint[1]);
        areaOfTriangles[3] = getSubArea(points[3][0],points[3][1],points[1][0],points[1][1],intersectingPoint[0],intersectingPoint[1]);
        for (int r = 0; r < areaOfTriangles.length - 1; r++) {
            for (int i = r +1; i < areaOfTriangles.length; i++) {
                if (areaOfTriangles[r] > areaOfTriangles[i]){
                    double temp = areaOfTriangles[r];
                    areaOfTriangles[r] = areaOfTriangles[i];
                    areaOfTriangles[i] = temp;
                }
            }
        }
        System.out.println("The areas are " + areaOfTriangles[0] + " " + areaOfTriangles[1] + " " + areaOfTriangles[2] + " " + areaOfTriangles[3]);
    }
    public static double getSubArea(double x1,double y1,double x2,double y2,double x3,double y3){
            double side1 = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
            double side2 = Math.sqrt(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2));
            double side3 = Math.sqrt(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2));
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public static double[][] swap(double[][] points){
        double temp = points[1][0];
        points[1][0] = points[2][0];
        points[2][0] = temp;
        temp = points[1][1];
        points[1][1] = points[2][1];
        points[2][1] = temp;
        return points;
    }


}
