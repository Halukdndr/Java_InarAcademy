package chapters.chapter_11.checkpoint;

public class CheckPoint_11 {
    public class Circle {
  private double radius;

        public Circle(double radius) {
            radius = radius;
          }

        public double getRadius() {
             return radius;
             }

       public double getArea() {
             return radius * radius * Math.PI;
             }
 }

      class B extends Circle {
 private double length;
        B(double radius, double length) {
             super(radius);  // super
             length = length;
            }

        @Override
        public double getArea() {
            return getArea() * length;
          }
 }
}
