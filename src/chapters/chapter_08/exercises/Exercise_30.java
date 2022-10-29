package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f:");
        double[][] a = new double[2][2];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = input.nextDouble();
            }
        }
       double[] b = new double[2];
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }
        if (hasSolution(a)){
            System.out.println("x is " + linearEquation(a,b)[0] + " and y is " + linearEquation(a,b)[1]);
        }else {
            System.out.println("The equation has no solution ");
        }


    }
    public static double[] linearEquation(double[][] a, double[] b){
        double[] xy = new double[2];
        xy[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        xy[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        return xy;
    }
    public static boolean hasSolution(double[][] a){
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0){
            return false;
        }else {
            return true;
        }
    }
}
