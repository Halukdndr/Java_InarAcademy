package chapters.chapter_07.exercises;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = input.nextDouble();
        }
        System.out.printf("The mean is %3.2f\n",mean(numbers));
        System.out.printf("The standard deviation is %6.5f", deviation(numbers));

    }
    public static double deviation(double[] x){
        double sum = 0;
        for (int i = 0;i < x.length;i++){
            sum += Math.pow(x[i] - mean(x),2);
        }
        return Math.sqrt(sum / (x.length - 1));
    }
    public static double mean(double[] x){
        double sum = 0;
        for (int i = 0;i < x.length;i++){
            sum += x[i];
        }
        return sum / x.length;
    }
}
