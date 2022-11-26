package chapters.chapter_12.examples;

public class CircleWithCustomException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException{
        this(1.0);
    }

    public void setRadius(double radius) throws InvalidRadiusException{
        if (radius < 0){
            throw new InvalidRadiusException(radius);
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

    public CircleWithCustomException(double radius) throws InvalidRadiusException{
        setRadius(radius);
        numberOfObjects++;
    }
    public double findArea() {
        return radius * radius * 3.14159;
    }
}
