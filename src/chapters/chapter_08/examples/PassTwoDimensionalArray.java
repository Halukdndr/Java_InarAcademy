package chapters.chapter_08.examples;

import java.util.Arrays;
import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = getArray();
        int result = sum(arr);
        for (int i = 0;i < arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(result);
    }
    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0;i < m.length;i++){
            for (int j = 0;j < m[i].length;j++){
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }
    public static int sum(int[][] m){
        int sum = 0;
        for (int i = 0;i < m.length;i++){
            for (int j = 0;j < m[i].length;j++){
                sum += m[i][j];
            }
        }
        return sum;
    }

}
