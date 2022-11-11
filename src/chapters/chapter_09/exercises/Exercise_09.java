package chapters.chapter_09.exercises;

public class Exercise_09 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("Polygon    Perimeter    Area" );
        System.out.println("  1           " + polygon1.getPerimeter() + "       " + (int)(polygon1.getArea() * 100) / 100.0);
        System.out.println("  2           " + polygon2.getPerimeter() + "      " + (int)(polygon2.getArea() * 100) / 100.0);
        System.out.println("  3           " + polygon3.getPerimeter() + "      " + (int)(polygon3.getArea() * 100) / 100.0);
    }
}
