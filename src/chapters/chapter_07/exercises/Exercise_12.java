package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = input.nextDouble();
        }
        reverse(numbers);
    }
    public static void reverse(double[] arr){

        for (int i = 0;i < arr.length / 2;i++){
            double temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
