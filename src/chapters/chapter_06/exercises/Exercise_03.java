package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        if (isPalindrome(num)){
            System.out.println("It's a palindrome");
        }else{
            System.out.println("It's not a palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        if (reverse(number) == number){
            return true;
        }else {
            return false;
        }
    }
    public static int reverse(int number){
        String str = number + "";
        String sum = "";
        for (int i = str.length() - 1; i >= 0;i--) {
            sum += str.charAt(i);
        }
        return Integer.parseInt(sum);
    }

}
