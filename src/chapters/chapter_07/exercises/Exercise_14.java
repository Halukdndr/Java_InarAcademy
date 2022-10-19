package chapters.chapter_07.exercises;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Please enter 5 numbers now to find their GCD:");
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("The GDC is " + gcd(numbers));
    }
    public static int gcd(int... numbers){
        int divisor = getMinValue(numbers);
        int GCD = 1;
        while (divisor > 0){
            if(isDivisible(divisor, numbers)) {
                GCD = divisor;
                break;
            }
            divisor--;
        }
        return GCD;
    }

    private static boolean isDivisible(int divisor, int[] numbers) {
        for (int i = 0; i <  numbers.length; i++) {
            if (numbers[i] % divisor != 0) {
                return false;
            }
        }
        return true;
    }

    public static int getMinValue(int[] numbers){
        int min = Integer.MAX_VALUE;
        for (int i = 0;i < numbers.length;i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}
