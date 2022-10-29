package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_09 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char[][] tok = new char[3][3];
        for (int i = 0; i < tok.length; i++) {
            Arrays.fill(tok[i], ' ');
        }
        while (!isTheTableFull(tok)){
            printTable(tok);
            prompterX(tok);
            if (checkWhole(tok)) {
                printTable(tok);
                System.out.println("X won");
                break;
            }
            if (isTheTableFull(tok)){
                break;
            }
            printTable(tok);
            prompterO(tok);
            if (checkWhole(tok)) {
                printTable(tok);
                System.out.println("O won");
                break;
            }
        }
        if (!checkWhole(tok)){
            System.out.println("Draw!If you want to continue enter 1 otherwise enter 0 ");
            int yesNo = input.nextInt();
            if (yesNo == 1){
                main(args);
            }else {
                System.exit(0);
            }
        }else {
            System.out.println("If you want to continue enter 1 otherwise enter 0 ");
            int yesNo = input.nextInt();
            if (yesNo == 1){
                main(args);
            }else {
                System.exit(0);
            }
        }


    }
    public static boolean isTheTableFull(char[][] table){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkWhole(char[][] table){
        if (checkHorizontal(table) || checkVertical(table) || checkRightUpDiagonal(table) || checkRightDownDiagonal(table)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkHorizontal(char[][] table) {
        for (int row = 0; row < table.length; row++) {
            if (table[row][0] != ' ' && table[row][0] == table[row][1] && table[row][0] == table[row][2]) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkVertical(char[][] table) {
        for (int col = 0; col < table[0].length; col++) {
            if (table[0][col] != ' ' && table[0][col] == table[1][col] && table[0][col] == table[2][col]){
                return true;
            }
        }
        return false;
    }

    public static boolean checkRightDownDiagonal(char[][] table) {
        int row = 0;
        int col = 0;
        for (int k = row + 1, t = col + 1; k < table.length && t < table.length; k++, t++) {
            if (table[row][col] == ' ' || table[row][col] != table[k][t]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkRightUpDiagonal(char[][] table) {
        int row = 2;
        int col = 0;
        for (int i = row - 1, k = col + 1; i >= 0 && k < table.length; i--, k++) {
            if (table[row][col] == ' ' || table[row][col] != table[i][k]) {
                return false;
            }
        }
        return true;
    }

    public static void printTable(char[][] table) {
        System.out.println("-------------");
        System.out.println("| " + table[0][0] + " | " + table[0][1] + " | " + table[0][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + table[1][0] + " | " + table[1][1] + " | " + table[1][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + table[2][0] + " | " + table[2][1] + " | " + table[2][2] + " |");
        System.out.println("-------------");
    }

    public static void prompterX(char[][] table) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, or 2) for player X:");
        int row = input.nextInt();
        while (2 < row || row < 0) {
            System.out.println("Wrong input!Enter a row (0, 1, or 2) for player X:");
            row = input.nextInt();
        }
        System.out.println("Enter a column (0, 1, or 2) for player X:");
        int col = input.nextInt();
        while (2 < col || col < 0) {
            System.out.println("Wrong input!Enter a column (0, 1, or 2) for player X:");
            col = input.nextInt();
        }
        if (table[row][col] != ' ') {
            System.out.println("This cell is filled!Enter another coordinate");
            prompterX(table);
        } else {
            table[row][col] = 'X';
        }
    }

    public static void prompterO(char[][] table) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, or 2) for player O:");
        int row = input.nextInt();
        while (2 < row || row < 0) {
            System.out.println("Wrong input!Enter a row (0, 1, or 2) for player O:");
            row = input.nextInt();
        }
        System.out.println("Enter a column (0, 1, or 2) for player O:");
        int col = input.nextInt();
        ;
        while (2 < col || col < 0) {
            System.out.println("Wrong input!Enter a column (0, 1, or 2) for player O:");
            col = input.nextInt();
        }
        if (table[row][col] != ' ') {
            System.out.println("This cell is filled!Enter another coordinate");
            prompterO(table);
        } else {
            table[row][col] = 'O';
        }
    }
}

