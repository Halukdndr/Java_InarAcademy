package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_24 {
    public static void main(String[] args) {
        int[][] sudokuSolution = readSolution();
        System.out.println("The solution is " + (checkSolution(sudokuSolution) ? "valid" : "invalid"));
    }

    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);
        int[][] solution = new int[9][9];
        System.out.println("Enter your solution");
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

    public static boolean checkRow(int[][] solution) {

        for (int row = 0; row < solution.length; row++) {
            boolean[] rowCheck = new boolean[solution.length];
            for (int col = 0; col < solution[row].length; col++) {
                if (rowCheck[solution[row][col] - 1] == true){
                    return false;
                }else {
                    rowCheck[solution[row][col] - 1] = true;
                }
            }
        }
        return true;
    }

    private static boolean checkCol(int[][] solution) {
        for (int col = 0; col < solution[0].length; col++) {
            boolean[] colCheck = new boolean[solution.length];
            for (int row = 0; row < solution.length; row++) {
                if (colCheck[solution[row][col] - 1] == true){
                    return false;
                }else {
                    colCheck[solution[row][col] - 1] = true;
                }
            }
        }
        return true;
    }

    public static boolean checkBox(int[][] solution) {
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[i].length; j++) {
                boolean[] checkBox = new boolean[solution.length];
                for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
                    for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                        if (checkBox[solution[row][col] - 1] == true){
                            return false;
                        }else {
                            checkBox[solution[row][col] - 1] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
