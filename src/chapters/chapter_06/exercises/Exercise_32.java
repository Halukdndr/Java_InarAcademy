package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_32 {
    public static void main(String[] args) {
        final int NUMBER_OF_GAMES = 10_000;

        int[] countWin = new int[NUMBER_OF_GAMES];
        for (int i = 0;i < NUMBER_OF_GAMES;i++) {
            int die1 = rollTheDie();
            int die2 = rollTheDie();
            craps(die1, die2, sumTheDice(die1, die2),countWin,i);
        }
        int winCount = 0;
        for (int i = 0; i < countWin.length;i++){
            if (countWin[i] == 1){
                winCount++;
            }
        }
        System.out.println("You won " + winCount + " times");
    }

    //Continue with the established point
    public static void reStartTheGame(int sum,int[] count,int i) {
        int die1 = rollTheDie();
        int die2 = rollTheDie();
        // conditions for established point
        if (sumTheDice(die1, die2) == sum) {
            System.out.println("The point is " + sum);
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sumTheDice(die1, die2));
            System.out.println("You win");
            count[i] = 1;
        } else if (sumTheDice(die1, die2) == 7) {
            System.out.println("The point is " + sum);
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sumTheDice(die1, die2));
            System.out.println("You lose");
        } else {
            System.out.println("The point is " + sum);
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sumTheDice(die1, die2));
            reStartTheGame(sum,count,i); // loop until find the 7 or established point
        }
    }


    // gives a random number 1 <= x <= 6
    public static int rollTheDie() {
        return (int) (Math.random() * 6 + 1);
    }

    // sum the dice
    public static int sumTheDice(int die1, int die2) {
        return die1 + die2;
    }

    // conditions for the first roll
    public static void craps(int die1, int die2, int sum,int[] count,int i) {
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
            System.out.println("You lose");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
            System.out.println("You win");
            count[i] = 1;
        } else {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
            reStartTheGame(sum,count,i);
        }
    }
}

