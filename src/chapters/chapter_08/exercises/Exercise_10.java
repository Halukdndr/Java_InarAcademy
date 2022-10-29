package chapters.chapter_08.exercises;

import java.util.Arrays;

public class Exercise_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        matrix = fillTheMatrixWith0sand1sRandomly(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("The largest row index: " + findTheFirstRowIndexWithTheMost1s(matrix));
        System.out.println("The largest column index: " + findTheFirstColumnIndexWithTheMost1s(matrix));

    }
    public static int[][] fillTheMatrixWith0sand1sRandomly(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        return matrix;
    }
    public static int findTheFirstRowIndexWithTheMost1s(int[][] matrix){
        int sumMaxRow = 0;
        int indexOfMaxRow = -1;
        for (int row = 0; row < matrix.length; row++) {
            int sumRow = 0;
            for (int col = 0; col < matrix[row].length; col++) {
              sumRow += matrix[row][col];
            }
            if (sumRow > sumMaxRow){
                sumMaxRow = sumRow;
                indexOfMaxRow = row;
            }
        }
        return indexOfMaxRow;
    }
    public static int findTheFirstColumnIndexWithTheMost1s(int[][] matrix){
        int sumMaxCol = 0;
        int indexOfMaxCol = -1;
        for (int col = 0; col < matrix[0].length; col++) {
            int sumCol = 0;
            for (int row = 0; row < matrix.length; row++) {
                sumCol += matrix[row][col];
            }
            if (sumCol > sumMaxCol){
                sumMaxCol = sumCol;
                indexOfMaxCol = col;
            }
        }
        return indexOfMaxCol;
    }
}
