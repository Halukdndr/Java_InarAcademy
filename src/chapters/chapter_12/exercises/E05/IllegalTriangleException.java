package chapters.chapter_12.exercises.E05;

public class IllegalTriangleException extends Exception{

    public IllegalTriangleException(){
        super();
    }
    public IllegalTriangleException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "The length of any side cannot be longer than the sum of the lengths of the other two sides.";
    }
}
