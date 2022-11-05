package chapters.chapter_09.examples;

public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {

        CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields(5);
        System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());

        c1.setRadius(c1.getRadius() + 1.1);
        System.out.println("The area of the circle of radius " + c1.getRadius() + " is " + c1.getArea());

        System.out.println("The number of circles created is " + CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
