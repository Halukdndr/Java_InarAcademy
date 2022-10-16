package weeks.week_10;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row and column values ");
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] arr = new int[row][column];
        fill2DArrWithRandomValues(arr,0,100);
    }
    public static int[][] fill2DArrWithRandomValues(int[][]arr,int start, int limit){
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                arr[i][j] = (int) (Math.random() * (limit - start) + start);
            }
        }
        return arr;
    }
}
