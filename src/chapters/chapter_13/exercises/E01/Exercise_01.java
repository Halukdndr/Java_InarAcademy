package chapters.chapter_13.exercises.E01;

import chapters.chapter_12.exercises.E05.IllegalTriangleException;
import chapters.chapter_13.examples.GeometricObject;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter your triangle's color and enter false if your triangle is empty vice versa enter true");
        String color = input.next();
        boolean isFilled = input.nextBoolean();

        Triangle tri = new Triangle(color,isFilled,side1,side2,side3);

        System.out.println(tri.toString() + "\n");
        tri.setFilled(false);
        tri.setSide1(side1 + 3);
        System.out.println(tri.toString());
    }
}
