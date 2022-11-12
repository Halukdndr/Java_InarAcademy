package chapters.chapter_10.exercises;

public class MyRectangle2D {
    private double x;
    private double y;

    private double width;
    private double height;

    public MyRectangle2D() {
        this(0,0,1,1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public boolean contains(double x,double y){
        return Math.abs(this.x - x) <= (this.width / 2.0) && Math.abs(this.y - y) <= (this.height / 2.0);
    }
    public boolean contains(MyRectangle2D r){
        // Edges of r
        double aX = r.x - r.width / 2.0;
        double aY = r.y + r.height / 2.0;
        double bX = r.x + r.width / 2.0;
        double bY = r.y + r.height / 2.0;
        double cX = r.x - r.width / 2.0;
        double cY = r.y - r.height / 2.0;
        double dX = r.x + r.width / 2.0;
        double dY = r.y - r.height / 2.0;
        return Math.abs(this.x - aX) <= (this.width / 2.0) && Math.abs(this.y - aY) <= (this.height / 2.0)
            && Math.abs(this.x - bX) <= (this.width / 2.0) && Math.abs(this.y - bY) <= (this.height / 2.0)
            && Math.abs(this.x - cX) <= (this.width / 2.0) && Math.abs(this.y - cY) <= (this.height / 2.0)
            && Math.abs(this.x - dX) <= (this.width / 2.0) && Math.abs(this.y - dY) <= (this.height / 2.0);
    }
    public boolean overlaps(MyRectangle2D r){
// Edges of r
        double aX = r.x - r.width / 2.0;
        double aY = r.y + r.height / 2.0;
        double bX = r.x + r.width / 2.0;
        double bY = r.y + r.height / 2.0;
        double cX = r.x - r.width / 2.0;
        double cY = r.y - r.height / 2.0;
        double dX = r.x + r.width / 2.0;
        double dY = r.y - r.height / 2.0;
        return Math.abs(this.x - aX) <= (this.width / 2.0) && Math.abs(this.y - aY) <= (this.height / 2.0)
            || Math.abs(this.x - bX) <= (this.width / 2.0) && Math.abs(this.y - bY) <= (this.height / 2.0)
            || Math.abs(this.x - cX) <= (this.width / 2.0) && Math.abs(this.y - cY) <= (this.height / 2.0)
            || Math.abs(this.x - dX) <= (this.width / 2.0) && Math.abs(this.y - dY) <= (this.height / 2.0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
