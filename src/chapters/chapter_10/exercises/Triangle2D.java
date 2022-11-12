package chapters.chapter_10.exercises;

public class Triangle2D {
        private MyPoint p1;
        private MyPoint p2;
        private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0,0),new MyPoint(1,1),new MyPoint(2,5));
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public boolean contains(double x,double y){
        return this.getArea() == new Triangle2D(p1,p2,new MyPoint(x,y)).getArea() + new Triangle2D(p1,p3,new MyPoint(x,y)).getArea() + new Triangle2D(p3,p2,new MyPoint(x,y)).getArea();
    }
    public boolean contains(MyPoint p){
        return this.getArea() == new Triangle2D(p1,p2,p).getArea() + new Triangle2D(p1,p3,p).getArea() + new Triangle2D(p3,p2,p).getArea();
    }
    public boolean contains(Triangle2D t){
        return this.contains(t.p1) && this.contains(t.p2) && this.contains(t.p3);
    }
    public boolean overlaps(Triangle2D t){
        return this.contains(t.getP1()) || this.contains(t.getP2()) || this.contains(t.getP3());
    }

    public double getArea(){
        double s1 = getS1();
        double s2 = getS2();
        double s3 = getS3();
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    public double getPerimeter(){
        return getS1() + getS2() + getS3();
    }

    private double getS3() {
        return Math.sqrt(Math.pow(p3.getX() - p2.getX(),2) + Math.pow(p3.getY() - p2.getY(),2));
    }

    private double getS2() {
        return Math.sqrt(Math.pow(p1.getX() - p3.getX(),2) + Math.pow(p1.getY() - p3.getY(),2));
    }

    private double getS1() {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(),2) + Math.pow(p1.getY() - p2.getY(),2));

    }
}
