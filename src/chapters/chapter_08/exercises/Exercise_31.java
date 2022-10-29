package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        for (int row = 0; row < points.length; row++) {
            for (int col = 0; col < points[row].length; col++) {
                points[row][col] = input.nextDouble();
            }
        }
        double[] abcdef = getABCDEF(points);
        if (isParallel(abcdef)){
            System.out.println("The two lines are parallel");
        }else {
            System.out.println("The intersecting point is at (" + getIntersectingPoint(abcdef)[0] + ", " + getIntersectingPoint(abcdef)[1] + ")");
        }

    }
    public static double[] getABCDEF(double[][] points){
        double[] abcdef = new double[6];
        abcdef[0] = points[0][1] - points[1][1];
        abcdef[1] = points[1][0] - points[0][0];
        abcdef[2] = points[2][1] - points[3][1];
        abcdef[3] = points[3][0] - points[2][0];
        abcdef[4] = points[0][0] * (points[0][1] - points[1][1]) - points[0][1] * (points[0][0] - points[1][0]);
        abcdef[5] = points[2][0] * (points[2][1] - points[3][1]) - points[2][1] * (points[2][0] - points[3][0]);
        return abcdef;
    }
    public static double[] getIntersectingPoint(double[] abcdef){
        double[] intersectingPoint = new double[2];
        intersectingPoint[0] = (abcdef[4] * abcdef[3] - abcdef[1] * abcdef[5]) / (abcdef[0] * abcdef[3] - abcdef[1] * abcdef[2]);
        intersectingPoint[1] = (abcdef[0] * abcdef[5] - abcdef[4] * abcdef[2]) / (abcdef[0] * abcdef[3] - abcdef[1] * abcdef[2]);
        return intersectingPoint;
    }
    public static boolean isParallel(double[] abcdef){
        if (abcdef[0] * abcdef[3] - abcdef[1] * abcdef[2] == 0){
            return true;
        }else {
            return false;
        }
    }
}
