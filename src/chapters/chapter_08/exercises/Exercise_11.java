package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        int[][] binaryTable = getBinaryValue(number);
        char[][] headsAndTails = convertHeadsAndTails(binaryTable);
        for (int row = 0; row < binaryTable.length; row++) {
            System.out.println(Arrays.toString(binaryTable[row]));
        }
        for (int row = 0; row < headsAndTails.length; row++) {
            System.out.println(Arrays.toString(headsAndTails[row]));
        }
    }
    public static int[][] getBinaryValue(int number){
        int [][] binaryTable = new int[3][3];
        for (int row = binaryTable.length - 1; row >= 0 ; row--) {
            for (int col = binaryTable[row].length - 1; col >= 0; col--) {
                binaryTable[row][col] = number % 2;
                number /= 2;
            }
        }
        return binaryTable;
    }
    public static char[][] convertHeadsAndTails(int[][] binaryTable){
       char[][] headsAndTails = new char[binaryTable.length][binaryTable[0].length];
        for (int row = 0; row < binaryTable.length; row++) {
            for (int col = 0; col < binaryTable[row].length; col++) {
                if (binaryTable[row][col] == 0){
                    headsAndTails[row][col] = 'H';
                }else {
                    headsAndTails[row][col] = 'T';
                }
            }
        }
        return headsAndTails;
    }
}
