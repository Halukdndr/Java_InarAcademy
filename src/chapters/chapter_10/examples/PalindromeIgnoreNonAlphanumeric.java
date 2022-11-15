package chapters.chapter_10.examples;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check is it palindrome or not");
        String s = input.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }
        String s1 = stringBuilder.toString();
        String s2 = stringBuilder.reverse().toString();
        if (s1.equals(s2)){
            System.out.println("The string is palindrome");
        }else {
            System.out.println("The string is not palindrome");
        }
    }
}
