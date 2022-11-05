package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_36 {
    public static void main(String[] args) {
        char[][] matrix = getFromUser();
        System.out.println("The input array is " + (isLatinSquare(matrix) ? "" : "not") + " a latin square");
    }
    public static char[][] getFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = input.nextInt();
        char[][] squareMatrix = new char[n][n];
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        for (int row = 0; row < squareMatrix.length; row++) {
            for (int col = 0; col < squareMatrix[row].length; col++) {
                squareMatrix[row][col] = input.next().charAt(0);
                if (65 > (int)squareMatrix[row][col] || (int)squareMatrix[row][col] >= 65 + n){
                    System.out.println("Wrong input: the letters must be from " + (char)65 + " to " + (char)(65 + n - 1));
                    System.exit(0
                    );
                }
            }
        }
        return squareMatrix;
    }
    public static boolean isLatinSquare(char[][] matrix){
        if (checkCol(matrix) && checkRows(matrix)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean checkRows(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            boolean[] allUnique = new boolean[matrix[0].length];
            for (int col = 0; col < matrix[row].length; col++) {
                if (allUnique[(int) matrix[row][col] - 65]) {
                    return false;
                } else {
                    allUnique[(int) matrix[row][col] - 65] = true;
                }
            }
            for (int i = 0; i < allUnique.length; i++) {
                if (!allUnique[i]){
                    return false;
                }
            }
        }
    return true;
    }
    public static boolean checkCol(char[][] matrix){
        for (int col = 0; col < matrix[0].length; col++) {
            boolean[] allUnique = new boolean[matrix.length];
            for (int row = 0; row < matrix.length; row++) {
                if (allUnique[(int) matrix[row][col] - 65]) {
                    return false;
                } else {
                    allUnique[(int) matrix[row][col] - 65] = true;
                }
            }
            for (int i = 0; i < allUnique.length; i++) {
                if (!allUnique[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
