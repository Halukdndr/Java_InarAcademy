package chapters.chapter_13.exercises.E01;

import chapters.chapter_12.exercises.E05.IllegalTriangleException;
import chapters.chapter_13.examples.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException {
        this("white",false,3,4,5);
    }

    public Triangle(String color, boolean isFilled, double side1, double side2, double side3) throws IllegalTriangleException {
        super(color, isFilled);
        if ((side1 + side2 <= side3)||(side1 +side3 <= side2)||(side2 + side3 <= side1)){
            throw new IllegalTriangleException("The length of any side cannot be longer than the sum of the lengths of the other two sides.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}