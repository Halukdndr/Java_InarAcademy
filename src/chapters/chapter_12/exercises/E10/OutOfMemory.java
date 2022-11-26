package chapters.chapter_12.exercises.E10;

public class OutOfMemory {
    public static void main(String[] args) {
        try {
            String[] arr = new String[1000000000 * 10];
        }catch (OutOfMemoryError ex){
            System.out.println("Out of memory");
        }
    }
}
