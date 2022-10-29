package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        final int ROW = 3;
        final int COL = 3;
        double[][] matrix = new double[ROW][COL];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
        System.out.println("------------");
        matrix = sortRows(matrix);
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }

    }
    public static double[][] sortRows(double[][] m){
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length - 1; col++) {
                for (int i = col + 1; i < m[row].length; i++) {
                    if (m[row][col] > m[row][i]){
                        double temp = m[row][col];
                        m[row][col] = m[row][i];
                        m[row][i] = temp;
                    }
                }
            }
        }
        return m;
    }
}
