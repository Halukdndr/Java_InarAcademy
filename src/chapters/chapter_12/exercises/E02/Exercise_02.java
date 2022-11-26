package chapters.chapter_12.exercises.E02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        while (true) {
            try {
                System.out.println("Enter 2 integers ");
                num1 = input.nextInt();
                num2 = input.nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Input is incorrect ");
                input.nextLine();
            }
        }
        System.out.println(sum(num1,num2));
    }
    public static int sum(int n1,int n2){
        return n1 + n2;
    }
}
