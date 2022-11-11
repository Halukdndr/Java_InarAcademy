package chapters.chapter_09.exercises;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] matrix = new double[row][col];
        System.out.println("Enter the array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        Location location = locateLargest(matrix);
        location.display();


    }
    public static Location locateLargest(double[][] a){
        int row = -1;
        int col = -1;
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue){
                    maxValue = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new Location(row,col,maxValue);
    }

}
