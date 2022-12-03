package chapters.chapter_13.checkpoints;

public class CheckPoint_05 {
    public static void main(String[] args) {
        Number[] numberArray = new Integer[2];
        numberArray[0] = new Double(1.5); // numberArray defined Number array but actual reference is Integer so in heap memory there are just two room for the Integer instance
    }
}
