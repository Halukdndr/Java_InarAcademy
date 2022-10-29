package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        int[][] values = getMatrix();
        for (int row = 0; row < values.length; row++) {

            System.out.println(Arrays.toString(values[row]));
        }
        System.out.println(isConsecutiveFour(values));
    }
    public static int[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns ");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the values ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
    public static boolean isConsecutiveFour(int[][] values){
        if (isConsecutiveFourHorizontal(values) || isConsecutiveFourVertical(values) || isConsecutiveFourRightDownDiagonal(values) || isConsecutiveFourRightUpDiagonal(values)){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isConsecutiveFourHorizontal(int[][] values){
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length - 3; col++) {
                int count = 0;
                for (int i = col + 1; i < col + 4; i++) {
                    if (values[row][col] != values[row][i]){
                        count++;
                    }
                }
                if (count == 0){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourVertical(int[][] values){
        for (int col = 0; col < values[0].length; col++) {
            for (int row = 0; row < values.length - 3; row++) {
                int count = 0;
                for (int i = row + 1; i < row + 4; i++) {
                    if (values[row][col] != values[i][col]){
                        count++;
                    }
                }
                if (count == 0){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourRightDownDiagonal(int[][] values){
        for (int row = 0; row < values.length - 3; row++) {
            for (int col = 0; col < values[row].length - 3; col++) {
                int count = 0;
                for (int i = row + 1,j = col + 1;i < row + 4 && j < col + 4;i++,j++){
                    if (values[row][col] != values[i][j]){
                        count++;
                    }
                }
                if (count == 0){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isConsecutiveFourRightUpDiagonal(int[][] values){
        for (int row = values.length - 1; row > 2 ; row--) {
            for (int col = 0; col < values[row].length - 3; col++) {
                int count = 0;
                for (int i = row - 1,j = col + 1; j < col + 4 && i > row - 4; i--,j++) {
                    if (values[row][col] != values[i][j]){
                        count++;
                    }
                }
                if (count == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
