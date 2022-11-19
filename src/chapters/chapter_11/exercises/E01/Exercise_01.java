package chapters.chapter_11.exercises.E01;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        // TODO how can i access the toString method of the superclass and getDate method

        Triangle t1 = getATriangleFromUser();
        GeometricObject g = new GeometricObject();
        GeometricObject f = new Triangle();
        System.out.println(f.toString());
        System.out.println(g.getDateCreated());
        System.out.println(t1.toString());
        System.out.println("Area of t1 = " + t1.getArea() +
                "\nPerimeter of t1 = " + t1.getPerimeter() +
                "\nColour of t1 = " + t1.getColor() +
                "\nt1 is filled = " + t1.isFilled());
    }
    public static Triangle getATriangleFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides for a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color of triangle: ");
        String colour = input.next();

        System.out.println("Enter whether the triangle is filled(true/false): ");
        boolean isFilled = input.nextBoolean();

        Triangle t1 = new Triangle(side1, side2, side3);
        t1.setColor(colour);
        t1.setFilled(isFilled);

        return t1;
    }
}
