package chapters.chapter_08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int row = input.nextInt();
        int[][] arr = new int[row][2];
        System.out.println("Enter the numbers");
        for (int i  = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-----------------------");
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
    public static void sort(int m[][]){
            for (int row = 0; row < m.length - 1; row++) {
                for (int i = row + 1; i < m.length; i++) {
                    if (m[row][0] > m[i][0]){
                        for (int j = 0; j < m[row].length; j++) {
                            int temp = m[row][j];
                            m[row][j] = m[i][j];
                            m[i][j] = temp;
                        }
                    }
            }
        }
        for (int row = 0; row < m.length - 1; row++) {
            for (int i = row + 1; i < m.length; i++) {
                if (m[row][0] == m[i][0]){
                    if (m[row][1] > m[i][1]){
                            int temp = m[row][1];
                            m[row][1] = m[i][1];
                            m[i][1] = temp;
                    }
                }
            }
        }
    }

}
