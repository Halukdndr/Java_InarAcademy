package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 side of your triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        if (MyTriangle.isValid(s1,s2,s3)){
            System.out.println("The area of " + s1 + ", " + s2 + ", " + s3 + " is " + MyTriangle.area(s1,s2,s3));
        }else {
            System.out.println("The input is invalid");
        }

    }
}
