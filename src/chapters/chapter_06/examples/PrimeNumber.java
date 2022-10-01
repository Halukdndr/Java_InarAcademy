package chapters.chapter_06.examples;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        final int numberOfPrimes = 50;
        int count = 0;
        int num = 2;

        while (count < numberOfPrimes) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(num);
                } else {
                    System.out.printf("%7d", num);
                }
            }
            num++;
        }

    }
}