package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        int[][] matrix = getTheMatrix();
        display(matrix);


    }

    private static void display(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
        int countAllSameRow = 0;
        for (int row = 0; row < matrix.length; row++) {
            if (checkTheRowAllTheSame(matrix, row) && matrix[row][0] == 0){
                System.out.println("All 0s on row " + row);
                countAllSameRow++;
            }else if (checkTheRowAllTheSame(matrix,row) && matrix[row][0] == 1){
                System.out.println("All 1s on row " + row);
                countAllSameRow++;
            }
        }
        if (countAllSameRow == 0){
            System.out.println("No same numbers on a row ");
        }
        int countAllSameCol = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            if (checkTheColAllTheSame(matrix,col) && matrix[0][col] == 0){
                System.out.println("All 0s on column " + col);
                countAllSameCol++;
            }else if (checkTheColAllTheSame(matrix,col) && matrix[0][col] == 1){
                System.out.println("All 1s on column " + col);
                countAllSameCol++;
            }
        }
        if (countAllSameCol == 0){
            System.out.println("No same numbers on a column ");
        }
        if (checkMajorDiagonal(matrix) && matrix[0][0] == 0){
            System.out.println("All 0s on the major diagonal");
        }else if (checkMajorDiagonal(matrix) && matrix[0][0] == 1){
            System.out.println("All 1s on the major diagonal");
        }else {
            System.out.println("No same numbers on the major diagonal");
        }
        if (checkSubDiagonal(matrix) && matrix[matrix.length - 1][0] == 0){
            System.out.println("All 0s on the sub-diagonal");
        } else if (checkSubDiagonal(matrix) && matrix[matrix.length - 1][0] == 1) {
            System.out.println("All 1s on the sub-diagonal");
        }else {
            System.out.println("No same numbers on the sub-diagonal");
        }
    }
        public static int[][] getTheMatrix () {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size for the matrix: ");
            int size = input.nextInt();
            if (size < 1){
                System.out.println("Wrong input");
                System.exit(0);
            }
            int[][] matrix = new int[size][size];
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[row][col] = (int) (Math.random() * 2);
                }
            }
            return matrix;
        }
        public static boolean checkTheRowAllTheSame ( int[][] matrix, int rowIndex){
            for (int col = 1; col < matrix[rowIndex].length; col++) {
                if (matrix[rowIndex][col] != matrix[rowIndex][0]) {
                    return false;
                }
            }
            return true;
        }
        public static boolean checkTheColAllTheSame ( int[][] matrix, int colIndex){
            for (int row = 1; row < matrix.length; row++) {
                if (matrix[row][colIndex] != matrix[0][colIndex]) {
                    return false;
                }
            }
            return true;
        }
        public static boolean checkMajorDiagonal ( int[][] matrix){
            for (int row = 1, col = 1; row < matrix.length && col < matrix[row].length; row++, col++) {
                if (matrix[row][col] != matrix[0][0]) {
                    return false;
                }
            }
            return true;
        }
        public static boolean checkSubDiagonal ( int[][] matrix){
            for (int row = 0, col = matrix[row].length - 1; col > 0 && row < matrix.length - 1; row++, col--) {
                if (matrix[row][col] != matrix[matrix.length - 1][0]) {
                    return false;
                }
            }
            return true;
        }
    }
