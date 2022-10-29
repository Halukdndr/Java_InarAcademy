package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_27 {
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
        System.out.println("----------------");
        double[][] sortedMatrix = sortColumns(matrix);
        for (int row = 0; row < sortedMatrix.length; row++) {
            System.out.println(Arrays.toString(sortedMatrix[row]));
        }
    }
    public static double[][] sortColumns(double[][] m) {
        for (int col = 0; col < m[0].length; col++) {
            for (int row = 0; row < m.length - 1; row++) {
                for (int i = row + 1; i < m.length; i++) {
                    if (m[row][col] > m[i][col]){
                        double temp = m[row][col];
                        m[row][col] = m[i][col];
                        m[i][col] = temp;
                    }
                }
            }
        }
        return m;
    }
}
