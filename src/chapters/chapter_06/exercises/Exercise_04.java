package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.print("The reversed version of " + num + " is ");
        reverse(num);
    }
    public static void reverse(int number){
       String sum = "";
        while (number != 0){
           sum += number % 10;
           number /= 10;
        }
        System.out.println(sum);
    }
}
