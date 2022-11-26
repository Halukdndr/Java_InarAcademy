package chapters.chapter_12.exercises.E05;

public class TestMyTriangle {
    public static void main(String[] args) throws IllegalTriangleException {

       try {
           MyTriangle tri = new MyTriangle(4, 5, 6);
           MyTriangle tri2 = new MyTriangle(1, 2, 4);
       }catch (IllegalTriangleException ex){
           System.out.println(ex);
           System.out.println(ex.getMessage());
       }
    }
}
