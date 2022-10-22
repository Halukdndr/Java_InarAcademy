package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        double[][] arr = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(arr,i));
        }

    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
            for (int j = 0; j < m.length; j++) {
                sum += m[j][columnIndex];
            }
            return sum;
    }
}
