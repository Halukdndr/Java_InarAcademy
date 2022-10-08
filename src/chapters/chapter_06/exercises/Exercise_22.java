package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and see it's square root");
        long n = input.nextLong();
        System.out.println("The approximate the square root of " + n + " is " + sqrt(n));
    }
    public static double sqrt(long n){
        double nextGuess = 0.0001;
        double lastGuess = 1;
        while (nextGuess != lastGuess){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;

        }
        return nextGuess;
    }
}
