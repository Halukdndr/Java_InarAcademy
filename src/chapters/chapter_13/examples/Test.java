package chapters.chapter_13.examples;

import chapters.chapter_13.examples.GeometricObject;

public class Test {
    public static void main(String[] args) {
        ComparableRectangle rectangle1 = new ComparableRectangle();
        rectangle1.setHeight(5);
        rectangle1.setWidth(4);
        ComparableRectangle rectangle2 = new ComparableRectangle();
        rectangle2.setHeight(4);
        rectangle2.setWidth(4);
        System.out.println(rectangle2.compareTo(rectangle1));
        System.out.println(rectangle1.compareTo(rectangle2));
        rectangle2.setWidth(5);
        System.out.println(rectangle2.compareTo(rectangle1));



    }
}
