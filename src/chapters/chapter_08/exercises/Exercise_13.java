package chapters.chapter_08.exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array: ");
        int numberOfRow = input.nextInt();
        int numberOfCol = input.nextInt();
        double[][] matrix = new double[numberOfRow][numberOfCol];
        System.out.println("Enter the array: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }
        System.out.println("The location of the largest element is at " + Arrays.toString(locateLargest(matrix)));

    }
    public static int[] locateLargest(double[][] a){
        double maxValue = Integer.MIN_VALUE;
        int[] index = new int[2];
        Arrays.fill(index, -1);
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] > maxValue){
                    maxValue = a[row][col];
                    index[0] = row;
                    index[1] = col;
                }
            }
        }
        return index;
    }
}
