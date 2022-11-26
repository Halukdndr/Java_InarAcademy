package chapters.chapter_12.examples;

public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException circle1 = new CircleWithException();
            CircleWithException circle2 = new CircleWithException(-5);
            CircleWithException circle3 = new CircleWithException(0);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
    }
}
