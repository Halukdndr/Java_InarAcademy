package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two chars and number per line for display the chars between them:");
        String str1 = input.next();
        String str2 = input.next();
        char ch1 = str1.charAt(0);
        char ch2 = str2.charAt(0);
        int numberPerline = input.nextInt();
        printChars(ch1,ch2,numberPerline);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int decimalValueOfCh1 = (int)ch1;
        int decimalValueOfCh2 = (int)ch2;
        int count = 0;
        while(decimalValueOfCh1 <= decimalValueOfCh2) {
            count++;
            if (count % numberPerLine == 0){
                System.out.println((char)decimalValueOfCh1);
            }else{
                System.out.print((char)decimalValueOfCh1 + " ");
            }
            decimalValueOfCh1++;
        }
    }
}
