package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        double[][] arr = new double[4][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(arr));
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0;i < m.length;i++){
            sum += m[i][i];
        }
        return sum;
    }
}
