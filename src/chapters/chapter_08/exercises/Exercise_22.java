package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
        System.out.println(isEvenNumberOf1s(matrix));

    }
    public static int[][] getMatrix(){
        int[][] matrix = new int[6][6];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 or 1 to fill 6 by 6 matrix");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }
        return matrix;
    }
    public static boolean isEvenNumberOf1sInRows(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            int count1 = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1){
                    count1++;
                }
            }
            if (count1 % 2 != 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEvenNumberOf1sInCols(int[][] matrix){
        for (int col = 0; col < matrix[0].length; col++) {
            int count1 = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1){
                    count1++;
                }
            }
            if (count1 % 2 != 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEvenNumberOf1s(int[][] matrix){
        if (isEvenNumberOf1sInCols(matrix) && isEvenNumberOf1sInRows(matrix)){
            return true;
        }else {
            return false;
        }
    }
}
