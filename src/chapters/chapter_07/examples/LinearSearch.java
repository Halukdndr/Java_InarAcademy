package chapters.chapter_07.examples;

import chapters.chapter_06.examples.RandomCharacter;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        char[] randomDigitNumbers = new char[20];
        getRandomDigitChars(randomDigitNumbers);
        System.out.println(Arrays.toString(randomDigitNumbers));
        char digit = pickRandomChar(randomDigitNumbers);
        System.out.println(digit + " is in the index of " + lineerSearch(randomDigitNumbers,digit));
    }

    private static char pickRandomChar(char[] arr) {
        int index = (int) (Math.random() * arr.length);
        return arr[index];
    }

    private static int lineerSearch(char[] arr,char d) {
        for (int i = 0;i < arr.length;i++){
            if (arr[i] == d){
                return i;
            }
        }
        return -1;
    }

    public static void getRandomDigitChars(char[] randomDigitNumbers) {
        for (int i = 0; i < randomDigitNumbers.length; i++){
            randomDigitNumbers[i] = RandomCharacter.getRandomDigitCharacter();
        }
    }

}
