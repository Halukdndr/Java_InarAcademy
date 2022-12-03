package chapters.chapter_13.examples;

public class Rectangle extends GeometricObject{
    private double height;
    private double width;

    public Rectangle(){
        this(1,1);
    }

    public Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, boolean isFilled, double height, double width) {
        super(color, isFilled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }
}
