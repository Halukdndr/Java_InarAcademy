package chapters.chapter_11.exercises.E16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.println(a + " + " + b + " =?");
        ArrayList<Integer> answers = new ArrayList<>();
        int answer = input.nextInt();
        while (a + b != answer) {
            if (answers.contains(answer)){
                System.out.println("You already entered " + answer);
            }else {
                System.out.println("Incorrect");
                answers.add(answer);
            }
            System.out.println(a + " + " + b + " =?");
            answer = input.nextInt();
        }
        System.out.println("Correct");
    }
}
