package chapters.chapter_09.exercises;

public class RegularPolygon {
    private int n;   // number of sides
    private double side;  // length of side
    private double x;  // x coordinate of polygon's center
    private double y;  // y coordinate of polygon's center

    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public double getPerimeter(){
        return this.n * this.side;
    }
    public double getArea(){
        return (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
