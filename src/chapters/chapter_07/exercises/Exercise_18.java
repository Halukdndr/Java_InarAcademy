package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers to sort");
        double[] numbers = new double[10];
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(bubbleSort(numbers)));

    }
    public static boolean isSorted(double[] arr){
        for (int i = 0;i < arr.length - 1;i++){
            if (arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static double[] bubbleSort(double[] arr){
        while (!isSorted(arr)){
            for (int i = 0;i < arr.length - 1;i++){
                if (arr[i] > arr[i + 1]) {
                    Exercise_17.swapDoubleArray(arr, i, i + 1);
                }
            }
        }
        return arr;
    }
}
