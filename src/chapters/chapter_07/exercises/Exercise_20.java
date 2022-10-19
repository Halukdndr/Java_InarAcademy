package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers to sort");
        double[] numbers = new double[10];
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = input.nextDouble();
        }
        reversedSelectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void reversedSelectionSort(double[] arr){
        for (int i = arr.length - 1;i > 0;i--){
            for (int j = i - 1;j >= 0;j--){
                if (arr[i] < arr[j]){
                    Exercise_17.swapDoubleArray(arr,i,j);
                }
            }
        }
    }

}
