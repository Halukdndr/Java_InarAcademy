package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.println("Enter the side: ");
        double s = input.nextDouble();
        System.out.println("The area of the polygon is " + area(n,s));
    }
    public static double area(int n, double side){
        return n * side * side / (4 * Math.tan(Math.toRadians(180 / n)));
    }
}
