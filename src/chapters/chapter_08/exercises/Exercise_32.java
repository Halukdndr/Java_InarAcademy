package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] edges = new double[3][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3:");
        for (int row = 0; row < edges.length; row++) {
            for (int col = 0; col < edges[row].length; col++) {
                edges[row][col] = input.nextDouble();
            }
        }
        if (Exercise_15.sameLine(edges)){
            System.out.println("The three points are on the same line");
        }else {
            System.out.printf("The area of the triangle is %3.2f", getTriangleArea(edges));
        }

    }
    public static double getTriangleArea(double[][] points){
        double side1 = Math.sqrt(Math.pow(points[1][0] - points[0][0],2) + Math.pow(points[1][1] - points[0][1],2));
        double side2 = Math.sqrt(Math.pow(points[2][0] - points[0][0],2) + Math.pow(points[2][1] - points[0][1],2));
        double side3 = Math.sqrt(Math.pow(points[2][0] - points[1][0],2) + Math.pow(points[2][1] - points[1][1],2));
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }
}
