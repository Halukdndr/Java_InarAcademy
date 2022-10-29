package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 list1 row by row:");
        final int ROW = 3;
        final int COL = 3;
        int[][] list1 = new int[ROW][COL];
        for (int row = 0; row < list1.length; row++) {
            for (int col = 0; col < list1[row].length; col++) {
                list1[row][col] = input.nextInt();
            }
        }
        System.out.println("Enter a 3 by 3 list2 row by row:");
        int[][] list2 = new int[ROW][COL];
        for (int row = 0; row < list2.length; row++) {
            for (int col = 0; col < list2[row].length; col++) {
                list2[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < list1.length; row++) {
            System.out.println(Arrays.toString(list1[row]));
        }
        System.out.println("----------");
        for (int row = 0; row < list2.length; row++) {
            System.out.println(Arrays.toString(list2[row]));
        }
        System.out.println("The two arrays are " + (equals(list1,list2) ? " " : "not ") + "strictly identical");
    }
    public static boolean equals(int[][] m1, int[][] m2){
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                if (m1[row][col] != m2[row][col]){
                    return false;
                }
            }
        }
        return true;
    }
}
