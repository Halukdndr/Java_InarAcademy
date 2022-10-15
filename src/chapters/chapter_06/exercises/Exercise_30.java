package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter for roll the dice");
        // To ignite the program
        String str = input.nextLine();
        // roll the dice
        int die1 = rollTheDie();
        int die2 = rollTheDie();
        craps(die1, die2, sumTheDice(die1, die2), input);
    }

    //Continue with the established point
    public static void reStartTheGame(Scanner input, int sum) {

        System.out.println("Press enter for roll the dice");
        String str = input.nextLine();
        int die1 = rollTheDie();
        int die2 = rollTheDie();
        // conditions for established point
        if (sumTheDice(die1, die2) == sum) {
            System.out.println("The point is " + sum);
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sumTheDice(die1, die2));
            System.out.println("You win");
        } else if (sumTheDice(die1, die2) == 7) {
            System.out.println("The point is " + sum);
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sumTheDice(die1, die2));
            System.out.println("You lose");
        } else {
            System.out.println("The point is " + sum);
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sumTheDice(die1, die2));
            reStartTheGame(input, sum); // loop until find the 7 or established point
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
    public static void craps(int die1, int die2, int sum, Scanner input) {
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
            System.out.println("You lose");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
            System.out.println("You win");
        } else {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
            System.out.println("The point is " + sum);
            reStartTheGame(input, sum);
        }
    }
}
