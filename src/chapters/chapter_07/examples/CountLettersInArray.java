package chapters.chapter_07.examples;

import chapters.chapter_06.examples.RandomCharacter;

public class CountLettersInArray {
    public static void main(String[] args) {
        /*
        generate 100 lowercase chars
        create an array for these chars
        for count the occurrences of each char create another array(alphebet [26])
        take all 100 chars' decimal value and subtract the decimal value of 'a' (the smallest lowerase char)
        the result represents the index of the char in alphebet[26]
        then count
         */

        // Assinged 100 lowercase chars to chars array
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }

        int[] alphabetCounter = new int[26];

        for (int i = 0; i < chars.length; i++) {
            alphabetCounter[chars[i] - 'a']++;
        }
        System.out.println("The lowercase letters are:");
        int countNumberOfLowercaseChars = 0;
        for (int i = 0; i < chars.length;i++){
            countNumberOfLowercaseChars++;
            if (countNumberOfLowercaseChars % 20 == 0) {
                System.out.println(chars[i]);
            }else {
                System.out.print(chars[i] + " ");
            }
        }
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        int countOccurencesTable = 0;
        for (int i = (int) 'a'; i <= (int) 'z'; i++) {
            countOccurencesTable++;
            if (countOccurencesTable % 10 == 0){
                System.out.print((char)i + " ");
                System.out.println(alphabetCounter[i - 'a']);
            }else {
                System.out.print((char) i + " ");
                System.out.print(alphabetCounter[i - 'a'] + " ");
            }
        }
    }
}
