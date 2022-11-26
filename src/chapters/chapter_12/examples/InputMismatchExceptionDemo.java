package chapters.chapter_12.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an integer: ");
                int num = input.nextInt();
                System.out.println("The number is " + num);
                continueInput = false;
            }catch (InputMismatchException ex){
                ex = new InputMismatchException("Only integer values can be input!");
                System.out.println(ex.getMessage());
                input.nextLine();
            }
        }while (continueInput);
    }

}
