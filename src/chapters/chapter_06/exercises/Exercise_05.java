package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        displaySortedNumbers(n1,n2,n3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
     double max = 0;
     double med = 0;
     double min = 0;
        if (num1 >= num2 && num1 >= num3 ){
            max = num1;
            if (num2 >= num3){
                med = num2;
                min = num3;
            }else {
                med = num3;
                min = num2;
            }
        } else if (num2 >= num1 && num2 >= num3 ) {
            max = num2;
            if (num1 >= num3) {
                med = num1;
                min = num3;
            }else {
                med = num3;
                min = num1;
            }
        }else {
            max = num3;
            if (num2 >= num1){
                med = num2;
                min = num1;
            }else{
                med = num1;
                min = num2;
            }
        }

        System.out.println(min + " " + med + " " + max);
    }
}
