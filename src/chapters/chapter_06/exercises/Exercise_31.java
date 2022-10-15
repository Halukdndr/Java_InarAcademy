package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer:");
        long cardNumber = input.nextLong();
        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid");
        }else {
            System.out.println(cardNumber + " is invalid");
        }
    }

    public static boolean isValid(long number) {
        if (prefixMatched(number) && (sumOddPlace(number) + sumDoubleEvenPlace(number)) % 10 == 0 && isLengthEnough(number)){
            return true;
        }else {
            return false;
        }
    }

    public static int sumOddPlace(long number) {
        int size = getSize(number);
        int sum = 0;
        int digit = 0;
        for (int i = 1; i < size; i += 2) {
            if (size % 2 == 0) {
                number %= Math.pow(10, size - i);
                digit = (int) (number / Math.pow(10, size - (i + 1)));
                sum += digit;
            } else {
                digit = (int) (number / Math.pow(10, size - i));
                number %= Math.pow(10, size - (i + 1));
                sum += digit;
            }
        }
        return sum;
    }
    public static int sumDoubleEvenPlace(long number) {
        int size = getSize(number);
        int sum = 0;
        int digit = 0;
        for (int i = 1; i < size; i += 2) {
            if (size % 2 == 0) {
                digit = (int) (number / Math.pow(10, size - i));
                number %= Math.pow(10, size - (i + 1));
                digit *= 2;
                if (digit >= 10) {
                    sum += digit / 10 + digit % 10;
                } else {
                    sum += digit;
                }
            } else {
                number %= Math.pow(10, size - i);
                digit = (int) (number / Math.pow(10, size - (i + 1)));
                digit *= 2;
                if (digit >= 10) {
                    sum += digit / 10 + digit % 10;
                } else {
                    sum += digit;
                }
            }
        }
        return sum;
    }
    public static boolean prefixMatched(long number) {
        if (getPrefix(number, 1) == 4 || getPrefix(number, 1) == 5 || getPrefix(number, 1) == 6 || getPrefix(number, 2) == 37) {
            return true;
        } else {
            return false;
        }
    }
    public static long getPrefix(long number, int k) {
        int size = getSize(number) - k;
        return (int)(number / Math.pow(10,size));
    }
    public static int getSize(long d) {
        String num = d + "";
        return num.length();
    }
    public static boolean isLengthEnough(long number){
        if (13 <= getSize(number) && getSize(number) <= 16){
            return true;
        }else {
            return false;
        }
    }

}
