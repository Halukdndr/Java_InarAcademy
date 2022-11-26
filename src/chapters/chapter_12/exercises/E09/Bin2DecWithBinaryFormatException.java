package chapters.chapter_12.exercises.E09;

import java.util.Scanner;

public class Bin2DecWithBinaryFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary value");
        String value = input.nextLine();
        int sum = 0;
        int a = 0;
        for (int i = value.length() - 1; i >= 0 ; i--) {
            if ( 48 > value.charAt(i) || value.charAt(i) > 49){
                throw new BinaryFormatException("Wrong input");
            }
            sum += Math.pow(2,a) * Integer.parseInt("" + value.charAt(i));
            a++;
        }

        System.out.println("The decimal value of " + value + " is " + sum);

    }
}
