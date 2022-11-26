package chapters.chapter_12.checkpoints;

import java.util.Scanner;

public class CheckPoint_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String token = input.nextLine();
        boolean isNumeric = true;
        for (int i = 0; i < token.length(); i++) {
            if (!Character.isDigit(i)){
                isNumeric = false;
            }
        }


    }
    public static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        }
        catch (java.lang.NumberFormatException ex) { // correct
            return false;
        }
    }
}
