package chapters.chapter_06.examples;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();

        int GCD = GCD(n1,n2);
        System.out.println("The greatest divisor of " + n1 + " and " + n2 + " is " + GCD);
    }
    public static int GCD(int num1,int num2){
        int divisor = Math.min(num1,num2);
        int GCD = 1;
        while (divisor > 0){
            if (num1 % divisor == 0 && num2 % divisor == 0){
                GCD = divisor;
                break;
            }
            divisor--;
        }
        return GCD;
    }
}
