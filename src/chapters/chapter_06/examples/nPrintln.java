package chapters.chapter_06.examples;

import java.util.Scanner;

public class nPrintln {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String str = input.nextLine();
        System.out.println("Enter how many times you want to repeat it: ");
        int i = input.nextInt();
        nPrintln(str,i);

    }
    public static void nPrintln(String message,int n){
        for (int i = 0; i < n; i++){
            System.out.println(message);
        }
    }

}
