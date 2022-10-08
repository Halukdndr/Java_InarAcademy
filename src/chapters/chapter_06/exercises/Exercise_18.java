package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = input.nextLine();
       if (isValid(password)){
           System.out.println("Valid Password");
       }else{
           System.out.println("Invalid Password");
       }

    }

    public static boolean isValid(String password) {
      return   isEnoughChars(password) && isLetterOrDigit(password) && is2DigitsAtLeast(password);
    }

    public static boolean is2DigitsAtLeast(String password) {
        int countDigit = 0;
        for (int i = 0; i < password.length();i++){
            if (Character.isDigit(password.charAt(i))){
                countDigit++;
            }
        }
        return countDigit >= 2;
    }

    public static boolean isEnoughChars(String password) {
        return password.length() >= 8;
    }

    public static boolean isLetterOrDigit(String password) {
        boolean isLetterOrDigit = false;
        for (int i = 0; i < password.length(); i++){
            if (Character.isLetterOrDigit(password.charAt(i))){
                isLetterOrDigit = true;
            }else {
                isLetterOrDigit = false;
                break;
            }
        }
        return isLetterOrDigit;
    }
}
