package chapters.chapter_13.examples;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(5);
        GeometricObject r1 = new Rectangle(5,3);

        System.out.println("The two objects have the same area? " + equalArea(c1,r1));

        displayGeometricObject(c1);
        displayGeometricObject(r1);
    }

    public static boolean equalArea(GeometricObject geoObject1, GeometricObject geoObject2) {
        return geoObject1.getArea() == geoObject2.getArea();
    }
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
         }
}
