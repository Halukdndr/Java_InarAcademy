package chapters.chapter_10.exercises;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(double x2 , double y2){
        return Math.sqrt(Math.pow(x2 - this.x,2) + Math.pow(y2 - this.y,2));
    }
    public double distance(MyPoint myPoint){
        return this.distance(myPoint.getX() , myPoint.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
