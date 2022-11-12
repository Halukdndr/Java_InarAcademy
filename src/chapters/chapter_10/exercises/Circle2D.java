package chapters.chapter_10.exercises;

public class Circle2D {
    private final double PI = Math.PI;
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0,0,1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * PI;
    }
    public double getPerimeter(){
        return 2 * radius * PI;
    }
    public boolean contains(double x,double y){
        return  ((this.x + radius) >= x && x >= (this.x - radius) && (this.y + radius) >= y && y >= (this.y - radius));
    }
    public boolean contains(Circle2D circle){
        return (this.contains(circle.x - circle.radius,circle.y - circle.radius) && this.contains(circle.x + circle.radius,circle.y + circle.radius));
    }
    public boolean overlaps(Circle2D circle){
        double distanceOfCentres = Math.sqrt(Math.pow(this.x - circle.x,2) + Math.pow(this.y - circle.y,2));
        double squareOrRadius = Math.pow(this.radius + circle.radius,2);
        return distanceOfCentres < squareOrRadius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
