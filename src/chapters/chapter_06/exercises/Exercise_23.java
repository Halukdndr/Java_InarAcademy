package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();
        System.out.println("Enter a character: ");
        String ch = input.next();
        char a = ch.charAt(0);
        System.out.println(str + " contains " + count(str,a) + " " + a);
    }
    public static int count(String str, char a){
        int countOfTheSpecifiedChar = 0;
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i) == a){
                countOfTheSpecifiedChar++;
            }
        }
        return countOfTheSpecifiedChar;
    }

}
