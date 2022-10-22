package chapters.chapter_08.examples;

import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        int[][] sudokuSolution = readSolution();
        System.out.println("The solution is " + (checkSolution(sudokuSolution) ? "valid" : "invalid"));
    }

    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);
        int[][] solution = new int[9][9];
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                solution[i][j] = input.nextInt();
            }
        }
        return solution;
    }
    public static boolean checkSolution(int[][] solution){
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                if (1 > solution[i][j] || solution[i][j] > 9){
                    return false;
                }
            }
        }
        if (checkBox(solution) && checkCol(solution) && checkRow(solution)){
            return true;
        }else {
            return false;
        }
    }
    public static boolean checkRow(int[][] solution){
        for (int row = 0; row < solution.length; row++) {
            for (int col = 0; col < solution[row].length - 1; col++) {
                for (int k = col + 1; k < solution[row].length; k++) {
                    if (solution[row][col] == solution[row][k]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkCol(int[][] solution){
        for (int col = 0; col < solution[0].length; col++) {
            for (int row = 0; row < solution.length - 1; row++) {
                for (int i = row + 1; i < solution.length; i++) {
                    if (solution[row][col] == solution[i][col]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkBox(int[][] solution){
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
                    for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                        if (row != i && col != j && solution[i][j] == solution[row][col]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
