package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println(str + " contains " + countLetters(str) + " letter/letters ");
    }
    public static int countLetters(String s){
        int countLetters = 0;
        for (int i = 0;i < s.length();i++){
            if (Character.isLetter(s.charAt(i))){
                countLetters++;
            }
        }
        return countLetters;
    }
}
