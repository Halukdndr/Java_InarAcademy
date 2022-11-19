package chapters.chapter_11.exercises.E06;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    @Override
    public String toString(){
        return this.radius + " " + this.getArea();
    }
}
