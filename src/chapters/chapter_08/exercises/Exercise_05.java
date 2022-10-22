package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        System.out.println("Enter matrix1(3 x 3) : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        double[][]matrix2 = new double[3][3];
        System.out.println("Enter matrix2(3 x 3) : ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
        System.out.println("The matrices are added as follows ");
        displayMatrix(matrix1,matrix2,addMatrix(matrix1,matrix2));
        }

    public static void displayMatrix(double[][] matrix1,double[][] matrix2,double[][] matrixSum) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            if (i == 1){
                System.out.print("  +  ");
            }else {
                System.out.print("     ");
            }
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            if (i == 1){
                System.out.print("  =  ");
            }else {
                System.out.print("     ");
            }
            for (int j = 0; j < matrixSum[i].length; j++) {
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] c = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}

