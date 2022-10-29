package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row and the column of the matrix ");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] matrix = new double[row][col];
        System.out.println("Enter the matrix");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = input.nextDouble();
            }
        }
        for (int r = 0; r < matrix.length; r++) {
            System.out.println(Arrays.toString(matrix[r]));
        }
        if (isMarkovMatrix(matrix)){
            System.out.println("The matrix is a markov matrix");
        }else {
            System.out.println("The matrix is not a markov matrix");
        }
    }
    public static boolean isMarkovMatrix(double[][] m){
        if (isNxNMatrix(m) && isPositiveAllTheElements(m) && isSumEquals1(m)){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isNxNMatrix(double[][] m){
        if (m.length == m[0].length){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isSumEquals1(double[][] m){

        for (int col = 0; col < m[0].length; col++) {
           double sum = 0;
            for (int row = 0; row < m.length; row++) {
                sum += m[row][col];
            }
            if (sum != 1){
                return false;
            }
        }
        return true;
    }
    public static boolean isPositiveAllTheElements(double[][] m){
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                if (m[row][col] < 0){
                    return false;
                }
            }
        }
        return true;
    }
}
