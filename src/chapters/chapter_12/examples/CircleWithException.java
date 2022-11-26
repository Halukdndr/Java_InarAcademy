package chapters.chapter_12.examples;

public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException() {
        this(1.0);
    }

    public void setRadius(double radius) throws IllegalArgumentException{
        if (radius < 0){
            throw new IllegalArgumentException("Radius can not be negative");
        }else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }
    public double findArea() {
        return radius * radius * 3.14159;
        }
}
