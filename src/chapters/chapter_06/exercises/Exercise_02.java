package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = input.nextLong();
        System.out.println(sumDigits(num));
    }
    public static int sumDigits(long n){
        int sum = 0;
        while (n != 0){
            int d = 0;
            d = (int)(n % 10);
            sum += d;
            n /= 10;
        }
        return sum;
    }
}
