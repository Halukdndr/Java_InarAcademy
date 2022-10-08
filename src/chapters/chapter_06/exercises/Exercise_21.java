package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine().toLowerCase();

        for (int i = 0;i < str.length();i++){
            if(97 <= str.charAt(i) && str.charAt(i) <= 122){
                System.out.print(getNumber(str.charAt(i)));
            }else{
                System.out.print(str.charAt(i));
            }
        }
    }
    public static int getNumber(char lowercaseLetter){
        if (lowercaseLetter == 'a' || lowercaseLetter == 'b' || lowercaseLetter == 'c') {
           return 2;
        } else if (lowercaseLetter == 'd' || lowercaseLetter == 'e' || lowercaseLetter == 'f') {
            return 3;
        } else if (lowercaseLetter == 'g' || lowercaseLetter == 'h' || lowercaseLetter == 'i') {
            return 4;
        } else if (lowercaseLetter == 'j' || lowercaseLetter == 'k' || lowercaseLetter == 'l') {
            return 5;
        } else if (lowercaseLetter == 'm' || lowercaseLetter == 'n' || lowercaseLetter == 'o') {
            return 6;
        } else if (lowercaseLetter == 'p' || lowercaseLetter == 'q' || lowercaseLetter == 'r' || lowercaseLetter == 's') {
            return 7;
        } else if (lowercaseLetter == 't' || lowercaseLetter == 'u' || lowercaseLetter == 'v') {
            return 8;
        } else {
            return 9;
        }
    }
}
