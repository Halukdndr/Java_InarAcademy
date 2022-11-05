package chapters.chapter_09.exercises;

public class Exercise_01 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);
        System.out.println("r1  width  heigth  area  perimeter");
        System.out.printf("    %5.1f %5.1f %8.1f %3.1f\n",r1.width,r1.height,r1.getArea(),r1.getPerimeter());
        System.out.println("r2  width  heigth  area  perimeter");
        System.out.printf("    %5.1f %5.1f %8.1f %3.1f",r2.width,r2.height,r2.getArea(),r2.getPerimeter());
    }
}
