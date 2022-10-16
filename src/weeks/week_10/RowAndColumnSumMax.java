package weeks.week_10;

import java.util.Arrays;
import java.util.Scanner;

public class RowAndColumnSumMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row value");
        int row = input.nextInt();
        System.out.println("Enter col  value ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        arr = TwoDArray.fill2DArrWithRandomValues(arr,0,10);
        print2DArray(arr);
        System.out.println(findSumMaxRow(arr));
        System.out.println(findSumMaxCol(arr));

    }
    public static int findSumMaxCol(int [][] arr){
        int sumMaxCol = Integer.MIN_VALUE;
        int maxColIndex = -1;
        for (int i = 0;i < arr[0].length;i++){
            if (getColSum(arr,i) > sumMaxCol){
                sumMaxCol = getColSum(arr,i);
                maxColIndex = i;
            }
        }
        return maxColIndex;
    }
    public static int getColSum(int[][] arr, int col){
        int sumCol = 0;
        for (int i = 0;i < arr.length;i++){
            sumCol += arr[i][col];
        }
        return sumCol;
    }
    public static int getRowSum(int[][] arr, int row){
        int sumRow = 0;
            for (int col = 0;col < arr[row].length;col++){
                sumRow += arr[row][col];
            }
        return sumRow;
    }
    public static int findSumMaxRow(int [][] arr){
        int sumMaxRow = Integer.MIN_VALUE;
        int maxRowIndex = -1;
        for (int i = 0;i < arr.length;i++){
            if (getRowSum(arr,i) > sumMaxRow){
                sumMaxRow = getRowSum(arr,i);
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }
    public static void print2DArray(int[][] arr){
        for (int i = 0;i < arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
