package chapters.chapter_12.exercises.E06;

import java.util.Scanner;

public class Hex2DecWithNumberFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex value ");
        String hex = input.nextLine();
        System.out.println("The decimal value of " + hex + " is " + getDecValue(hex.toUpperCase()));
    }

    public static int getDecValue(String hex) {

        int decimalValue = 0;
        int a = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            decimalValue += Math.pow(16, a) * hexChar2Dec(ch);
            a++;
        }
        return decimalValue;
    }

    public static int hexChar2Dec(char hex) throws NumberFormatException{
        if ('A' <= hex & hex <= 'F') {
            return hex - 'A' + 10;
        } else if ('0' <= hex && hex <= '9'){
            return hex - '0';
        }else {
            throw new NumberFormatException("Wrong input");
        }

    }
}